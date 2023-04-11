import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m [] = new int [n];
        double sum = 0;
        double mean = 0;
        int c = 0;

        for(int i=0;i<m.length;i++){
            m [i]=in.nextInt();
            if(m [i]<0){
                c++;
                sum+=m [i];
                mean = sum/c;
            }
        }System.out.print(mean);

    }
}