import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int data [] = new int[n];

        for(int i = 0; i<data.length;i++){
            data [i] = in.nextInt();
        }

        int k = in.nextInt();

        for(int i = 0; i<data.length;i++){
            if(data[i]%k==0){
                if(data[i]!=0){
                    System.out.print(data[i] + " ");
                }
            }
        }

    }
}