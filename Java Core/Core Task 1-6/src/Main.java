import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.print(check(input1,input2));
    }

    public static String check (String input1, String input2){
        String log = "admin";
        String pass = "qwerty";

        if(input1.equals(log) && input2.equals(pass)){
            return "Authentication completed";
        }else{
            return "Invalid login or password";
        }
    }
}