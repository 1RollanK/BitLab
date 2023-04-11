import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = 0;

        while(n!=0){
            if(n>h){
                h = n;
            }
            n = in.nextInt();
        }System.out.print(h);

    }
}