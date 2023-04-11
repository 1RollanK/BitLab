import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        for(int i = a; i<=b; i++)
            if(i%d==0){
                System.out.print(i + " ");
            }
    }
}