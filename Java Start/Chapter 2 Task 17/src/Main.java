import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>20){System.out.println(n/6);}else{System.out.println(n*6);}
    }
}