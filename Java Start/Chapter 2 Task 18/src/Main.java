import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>0){System.out.println(n+1);}
        else if(n<0){System.out.println(n-2);}
        else{System.out.println(n+10);}
    }
}