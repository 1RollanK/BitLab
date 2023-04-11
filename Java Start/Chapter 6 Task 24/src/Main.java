import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count = 0;

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                count++;
            }
        }
        System.out.print(count);
    }
}