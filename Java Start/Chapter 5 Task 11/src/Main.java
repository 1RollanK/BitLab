import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr [][] = new int [n][m];
        int sum=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr [i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];


            } System.out.println(sum);
            sum = 0;
        }   System.out.println();
    }
}