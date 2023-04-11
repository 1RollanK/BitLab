import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int data [][] = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};

        System.out.print(data [n][m]);

    }
}