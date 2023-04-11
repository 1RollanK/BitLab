import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String sentence = in.next();
        sentence = sentence.toLowerCase();
        String inletter = in.next();
        char x = inletter.charAt(0);
        int count = 0;

        for(int i=0;i<sentence.length();i++){
            if(x == sentence.charAt(i)){
                count++;
            }
        }
        System.out.print(count);

    }
}