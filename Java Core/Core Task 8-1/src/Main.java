import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User[] users = new User[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите данные для пользователя №" + (i + 1));
            System.out.print("Введите имя: ");
            String name = in.nextLine();
            System.out.print("Введите фамилию: ");
            String surname = in.nextLine();
            System.out.print("Введите возраст: ");
            int age = 0;

            try {
                age = in.nextInt();
                in.nextLine(); // очищаем буфер ввода
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Неверный формат возраста. Возраст будет установлен на 0.");
            }
            users[i] = new User(name, surname, age);
        }
        int sumAge = 0;
        for (User user : users) {
            sumAge += user.age;
        }
        double averageAge = (double) sumAge / users.length;
        System.out.println("Средний возраст пользователей: " + averageAge);
    }
}

