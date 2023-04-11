import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt ();
        int m = in.nextInt();

        while (n<=m){
            if (n%2==0){
                System.out.print(n + " ");
            } n++;


        }
    }
}