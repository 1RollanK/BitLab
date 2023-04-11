import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ab = a+b;

        if(a!=b){System.out.println(ab + " " + ab);}else{System.out.println("0 0");}
    }
}