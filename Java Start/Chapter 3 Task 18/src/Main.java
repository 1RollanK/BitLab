import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int k = 3;
        int sum = 0;

        while (i<=n){
            sum = sum+k;
            k=k+3;
            i++;
        }System.out.println(sum);


    }
}