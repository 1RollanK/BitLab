import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = getMax(a,b,c);

        System.out.print(max);
    }

    public static int getMax(int a,int b,int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }
}

