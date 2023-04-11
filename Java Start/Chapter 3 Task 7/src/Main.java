import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int i = 1;

        while(n>=i){
            if(i%2==1){
                System.out.print(i + " ");
            } i++;
        }
    }
}