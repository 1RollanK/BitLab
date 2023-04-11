import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                sum += c-'0';
            }
        }
        System.out.print(sum);
    }
}