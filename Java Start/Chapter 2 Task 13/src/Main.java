import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && a>c && b>c){System.out.println(a-c);}
        else if(a>b && a>c && c>b){System.out.println(a-b);}
        else if(b>a && b>c && a>c){System.out.println(b-c);}
        else if(b>a && b>c && c>a){System.out.println(b-a);}
        else if(c>a && c>b && b>a){System.out.println(c-a);}
        else if(c>a && c>b && a>b){System.out.println(c-b);}

    }
}