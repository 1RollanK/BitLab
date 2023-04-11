import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int array [] = new int [n];

        for(int i=0;i<n;i++){
            array [i] = in.nextInt();
        }
        int x = n;
        for(int i=0;i<n;i++){
            x--;
            System.out.print(array [x] + " ");
        }
    }
}