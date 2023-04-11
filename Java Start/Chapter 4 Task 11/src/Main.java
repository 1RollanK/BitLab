import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m [] = new int [n];
        double sum = 0;


        for(int i=0;i<m.length;i++){
            m [i] = in.nextInt();
        }
        for(int i=0;i<m.length;i++){
            sum+=m[i];
        }double average = sum/n;
        int value = (int) sum;
        System.out.print(value + " " + average);
    }
}