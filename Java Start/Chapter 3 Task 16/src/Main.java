import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;

        while(n<=m){
            if(n%2==0){
                count++;
            }            n++;
        }System.out.println(count);


    }
}