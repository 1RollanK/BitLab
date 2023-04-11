import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String output = textToNumber(input);

        System.out.println(output);
    }

    public static String textToNumber(String text) {
        HashMap<String, Integer> wordToNumber = new HashMap<>();
        wordToNumber.put("zero", 0);
        wordToNumber.put("one", 1);
        wordToNumber.put("two", 2);
        wordToNumber.put("three", 3);
        wordToNumber.put("four", 4);
        wordToNumber.put("five", 5);
        wordToNumber.put("six", 6);
        wordToNumber.put("seven", 7);
        wordToNumber.put("eight", 8);
        wordToNumber.put("nine", 9);
        wordToNumber.put("ten", 10);
        wordToNumber.put("eleven", 11);
        wordToNumber.put("twelve", 12);
        wordToNumber.put("thirteen", 13);
        wordToNumber.put("fourteen", 14);
        wordToNumber.put("fifteen", 15);
        wordToNumber.put("sixteen", 16);
        wordToNumber.put("seventeen", 17);
        wordToNumber.put("eighteen", 18);
        wordToNumber.put("nineteen", 19);
        wordToNumber.put("twenty", 20);
        wordToNumber.put("thirty", 30);
        wordToNumber.put("forty", 40);
        wordToNumber.put("fifty", 50);
        wordToNumber.put("sixty", 60);
        wordToNumber.put("seventy", 70);
        wordToNumber.put("eighty", 80);
        wordToNumber.put("ninety", 90);

        String[] words = text.toLowerCase().split("\\s+");
        String result = "";
        for (String word : words) {
            if (wordToNumber.containsKey(word)) {
                result += wordToNumber.get(word) + " ";
            } else {
                result += word + " ";
            }
        }

        return result.trim();
    }
}