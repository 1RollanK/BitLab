import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int year = in.nextInt();

        if(month>1 && month<12 && year>1000 && year<2001){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}