import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        int i = 1;
        int sum = 0;

        while(i<=n){
            sum = sum+k;
            k = k+2;
            i++;
        }
        System.out.println(sum);
    }
}