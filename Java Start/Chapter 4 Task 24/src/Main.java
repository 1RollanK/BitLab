import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array [] = new int [n];

        for(int i=0;i<n;i++){
            array [i] = in.nextInt();
        }

        int m = in.nextInt();
        boolean flag = false;
        int index = 0;

        for(int i=0;i<n;i++){
            if(m==array[i]){
                flag = true;
                index = i;
                break;
            }
        }

        if(flag==true){
            System.out.println("YES");
            System.out.println(index);
        }else{System.out.println("NO");

        }
    }
}