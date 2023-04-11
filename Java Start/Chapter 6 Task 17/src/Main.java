import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        String reversed = "";

        for(int i=s2.length()-1;i>=0;i--){
            reversed += s2.charAt(i);
        }

        if(s1.equals(reversed)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}