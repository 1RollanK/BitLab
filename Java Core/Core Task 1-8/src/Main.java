import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        switchRows(arr);
    }

    public static void switchRows(int[][] arr) {
        for (int j = 0; j < n; j++) {
            int temp = arr[0][j];
            arr[0][j] = arr[n - 1][j];
            arr[n - 1][j] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}