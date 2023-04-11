import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String word = in.next();
        String temp = in.next();
        char letter = temp.charAt(0);

        System.out.print(countletter(word,letter));
    }

    public static int countletter (String word, char letter){
        word = word.toLowerCase();
        letter = Character.toLowerCase(letter);
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}