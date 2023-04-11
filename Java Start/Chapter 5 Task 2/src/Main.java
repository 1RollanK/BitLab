import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int data [][] = new int [2][n];

        for(int i = 0;i < 2;i++){
            for (int j = 0; j < n;j++){

                data [i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 2;i++){
            for (int j = 0; j < n;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}