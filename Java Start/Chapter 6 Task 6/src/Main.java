import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String str1 = in.next();
        String str2 = in.next();
        char x = str2.charAt(0);
        boolean flag = false;
        int index = 0;

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==x){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag == true){
            System.out.print(index);
        }else{System.out.print("THERE IS NO SUCH LETTER");
        }
    }
}