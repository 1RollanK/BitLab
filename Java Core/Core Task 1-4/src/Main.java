import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.print(palindrome(word));
    }

    public static String palindrome (String word){
        String temp = "";
        for(int i=word.length()-1;i>=0;i--){
            temp += word.charAt(i);
        }
        if(word.equals(temp)){
            return "YES";
        }else{
            return "NO";
        }
    }
}