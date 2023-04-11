import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                ch = '0';
            }
            output+=ch;
        }
        System.out.print(output);
    }
}