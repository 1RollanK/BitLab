import java.util.*;
public class Main {
    static String input;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        input = in.next();
        repeatLetters(input);
    }

    public static void repeatLetters(String input){

        for(int i=0;i<input.length();i++){
            System.out.print(input.charAt(i));
            System.out.print(input.charAt(i));
        }
    }
}