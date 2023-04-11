import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m[] = new int[n];
        int sum = 0;
        int mean = 0;
        int d = 0;

        for(int i=0;i<m.length;i++){
            m[i] = in.nextInt();
        }
        for(int i=0;i<m.length;i++){
            sum+=m[i];
        }
        mean = sum/n;


        for(int i=0;i<m.length;i++){if(m[i]>mean){
            System.out.print(m[i] + " "); }
        }

    }
}