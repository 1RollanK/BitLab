import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m [] = new int [n];
        int sum = 0;

        for(int i=0;i<m.length;i++){
            m [i] = in.nextInt();

        }
        int total = 0;
        for(int i=0;i<m.length;i++){
            total+=m[i];
        }System.out.print(total);
    }
}