import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        while(n!=0){
            if(n%2==1 || n%2==-1){
                sum = sum+n;
            }
            n=in.nextInt();
        }
        System.out.print(sum);

    }
}