import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        oddEven(n);
    }

    public static void oddEven(int n){

        if(n%2==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}