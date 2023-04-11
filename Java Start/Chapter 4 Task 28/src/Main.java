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

        for(int i=0;i<n;i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }

        }

    }
}