import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int scores[] =  new int [size];

        for(int i=0;i<scores.length;i++){
            scores [i] = in.nextInt();
        }

        for (int i=0;i<scores.length;i++){
            System.out.println(i + " - " + scores[i]);
        }




    }
}