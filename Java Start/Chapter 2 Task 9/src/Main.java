import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a<b && a<c){System.out.println(a);}
        else if(b<a && b<c){System.out.println(b);}
        else if(c<b && c<a){System.out.println(c);}
    }
}