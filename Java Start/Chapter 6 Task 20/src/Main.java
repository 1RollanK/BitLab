import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String n = in.next();

        int i = Integer.parseInt(String.valueOf(n.charAt(0)));

        System.out.print(n.charAt(1) + "" + (i*2));
    }
}