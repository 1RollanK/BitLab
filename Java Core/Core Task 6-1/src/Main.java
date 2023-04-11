public class Main {
    public static void main(String[] args) {
        Users[] users = new Users[10];
        users[0] = new Users("John", "Smith");
        users[1] = new Users("Jane", "Doe");
        users[2] = new Users("Alex", "Johnson");
        users[3] = new Users("Alice", "Brown");
        users[4] = new Users("Jack", "Wilson");
        users[5] = new Users("John", "Doe");
        users[6] = new Users("Peter", "Smith");
        users[7] = new Users("Sarah", "Lee");
        users[8] = new Users("Tom", "Jones");
        users[9] = new Users("John", "Wilson");

        UserBeanImp userBean = new UserBeanImp(users);

        // Вывод всех пользователей
        System.out.println("All users:");
        userBean.getAllUsers();

        // Вывод пользователей по имени "John"
        System.out.println("\nUsers with name John:");
        userBean.getUsersByName("John");

        // Вывод пользователей по фамилии "Smith"
        System.out.println("\nUsers with surname Smith:");
        userBean.getUsersBySurname("Smith");
    }
}
