import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }

        for(int j=0;j<m;j++){
            int i =0;
            int max = arr[i][j];
            for(i=0;i<n;i++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }

    }
}