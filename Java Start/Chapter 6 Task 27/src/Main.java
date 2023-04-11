import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String s1 = in.next();
        String s2 = in.next();

        // Создаем регулярное выражение для поиска всех вхождений слова s1 в любом регистре
        String regex = "(?i)\\b" + s1 + "\\b";

        // Заменяем все вхождения слова s1 на слово s2 и сохраняем результат в переменную output
        String output = text.replaceAll(regex, s2);

        System.out.print(output);
    }
}