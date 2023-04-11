import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int data [][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                data [i][j] = in.nextInt();
            }
        }
        int k = in.nextInt();
        for(int i=0;i<m;i++){
            System.out.print(data[k][i] + " ");
        }
    }
}