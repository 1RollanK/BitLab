import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int i = 0;

        while(n!=0){
            i++;
            n = in.nextInt();
        }

        System.out.print(i);

    }
}
