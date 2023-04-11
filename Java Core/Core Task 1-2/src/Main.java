import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три натуральных числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        checkTriangleExistence(a, b, c);
    }

    public static void checkTriangleExistence(int a, int b, int c){
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}