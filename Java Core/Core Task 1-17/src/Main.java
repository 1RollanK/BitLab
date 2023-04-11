import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String input = in.next();
        char operator = input.charAt(0);

        solve(a,b,operator);
    }

    public static void solve(int a, int b, char operator) {

        if(operator=='+'){
            System.out.print(a+b);
        }
        if(operator=='-'){
            System.out.print(a-b);
        }
        if(operator=='*'){
            System.out.print(a*b);
        }
        if(operator=='/'){
            System.out.print(a/b);
        }
    }
}