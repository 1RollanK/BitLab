import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();

        str1 = str1.replace("one","1");
        str1 = str1.replace("two","2");
        str1 = str1.replace("three","3");
        str1 = str1.replace("four","4");
        str1 = str1.replace("five","5");
        str1 = str1.replace("six","6");
        str1 = str1.replace("seven","7");
        str1 = str1.replace("eight","8");
        str1 = str1.replace("nine","9");
        System.out.print(str1);


    }
}