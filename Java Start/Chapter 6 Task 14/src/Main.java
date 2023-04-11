import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s1 = in.next();
        String s2 = in.next();

        if(s1.contains(s2)){
            System.out.print("Yes");
        }else{System.out.print("No");
        }

    }
}