import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int x = 1;
        int sum = 1;
        while (n>i){
            x++;
            sum = sum*x;
            i++;

        }System.out.print(sum);

    }
}