import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int array [] = new int [n];

        for(int i=0;i<n;i++){
            array [i] = in.nextInt();
        }

        int pre = -1;
        int post = -1;
        int sum = 0;

        for(int i=0;i<n;i++){
            if(array [i] == 0){
                pre=i;
                break;
            }
        }

        for(int i=pre;i<n;i++){
            if(array [i] == 0){
                post = i;

            }
        }

        for(int i=pre;i<=post;i++){
            sum+=array [i];
        }
        System.out.println(sum);
    }
}