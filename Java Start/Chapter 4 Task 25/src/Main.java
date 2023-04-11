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

        int m = in.nextInt();
        int sum = 0;
        double x = 0;
        for(int i=0;i<n;i++){
            if(array [i]>m){
                sum+=array [i];
                x++;
            }
        }
        double mean = sum/x;
        System.out.print(mean);
    }
}