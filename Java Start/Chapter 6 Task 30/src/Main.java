import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] words = input.split("\\s+");
        StringBuilder reversedWords = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWords.append(reversedWord.reverse()).append(" ");
        }

        String output = reversedWords.toString().trim();

        System.out.println(output);
    }
}