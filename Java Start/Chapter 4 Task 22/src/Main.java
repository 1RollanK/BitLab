import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int array [] = new int [n];

        for(int i =0;i<n;i++){
            array [i] = in.nextInt();
        }

        int high = array[0];
        int low = array [0];

        for(int i =0;i<n;i++){
            if(array[i]>high){
                high = array[i];
            }
            if(array[i]<low){
                low = array[i];
            }

        }System.out.print(high-low);

    }
}