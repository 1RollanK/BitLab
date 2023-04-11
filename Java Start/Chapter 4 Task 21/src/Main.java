import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int data [] = new int [n];

        for(int i=0;i<data.length;i++){
            data [i] = in.nextInt();
        }

        int high = data[0];
        int low = data[0];

        for(int i=0;i<data.length;i++){
            if(data[i]>high){
                high = data [i];
            }
            if(data[i]<low){
                low = data[i];
            }
        } System.out.print(low + " " + high);

    }
}