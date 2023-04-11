import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr[][] = new int [n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.nextInt();
            }
        }

        int high = arr[0][0];
        int low = arr[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<high){
                    high = arr[i][j];
                }if(arr[i][j]>low){
                    low = arr[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==high){
                    arr[i][j] = low;
                }else if(arr[i][j]==low){
                    arr[i][j] = high;
                }System.out.print(arr[i][j] + " ");
            }System.out.println();
        }

    }
}