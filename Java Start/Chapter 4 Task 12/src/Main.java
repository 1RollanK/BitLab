import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m [] = new int [n];
        int sum = 0;
        int average = 0;
        int c = 0;

        for(int i=0;i<m.length;i++){
            m [i] = in.nextInt();
            if(m [i]%2==0){
                c++;
                sum+=m[i];
                average = sum/c;
            }
        }
        System.out.print(average);
    }
}