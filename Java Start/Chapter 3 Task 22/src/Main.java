import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int sum = 0;
        while(n!=0){
            sum = sum+n;
            i++;
            n=in.nextInt();
        }System.out.print(sum/i);


    }
}