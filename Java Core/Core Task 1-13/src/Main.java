import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int result = countVowels(input);
        System.out.print(result);
    }

    public static int countVowels(String input) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}