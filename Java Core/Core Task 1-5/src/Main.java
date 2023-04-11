import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        System.out.print(contains(s1,s2));
    }

    public static String contains(String s1, String s2){
        if(s1.contains(s2)){
            return "YES";
        }else{
            return "NO";
        }
    }
}