import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("a=" + (a+b));
        System.out.println("b=" + (c-a));
        System.out.println("c=" + (a+b+c));


    }
}