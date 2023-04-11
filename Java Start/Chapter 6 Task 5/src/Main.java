import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.equals(str2)){
            System.out.print("THEY ARE EQUAL");
        }else{System.out.print("THEY ARE NOT EQUAL");
        }

    }
}