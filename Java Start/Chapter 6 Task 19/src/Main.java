import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n = in.next();
        String reversed = "";

        for(int i=n.length()-1;i >= 0; i--){
            reversed += n.charAt(i);
        }

        if(n.equals(reversed)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}