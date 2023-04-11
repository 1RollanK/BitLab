import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 ="";

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            s2 = ch+s2;
        }

        System.out.print(s2);

    }
}