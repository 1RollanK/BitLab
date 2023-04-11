import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();
        double c = 1;
        double sum = 0;

        while(d!=0){
            sum = d*c;
            c=sum;
            d=in.nextDouble();
        }
        System.out.print(sum);


    }
}