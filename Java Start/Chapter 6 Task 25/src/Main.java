import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = "";

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
                if(i == 0 || input.charAt(i-1) == ' '){
                    output += Character.toUpperCase(ch);
                }else{
                    output += ch;
                }
            }
        System.out.println(output);
    }
}