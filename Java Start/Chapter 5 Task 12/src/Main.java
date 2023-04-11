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
                arr[i][j] = in.nextInt();
            }
        }

        int high = arr[0][0];
        int indexi = 0;
        int indexj = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(high<arr[i][j]){
                    high = arr[i][j];
                    indexi = i;
                    indexj = j;
                }
            }
        }  System.out.println(high);
        System.out.println(indexi + " " + indexj);
    }
}