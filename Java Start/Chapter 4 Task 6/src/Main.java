import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m [] = new int [n];

        for(int i=0;i<m.length;i++){
            m [i] = in.nextInt();
        }
        for(int i =0;i<m.length;i++){
            System.out.print(m[i]*m[i] + " ");
        }
    }
}