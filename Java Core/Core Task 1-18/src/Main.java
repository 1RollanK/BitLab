import java.util.Scanner;

public class Main {
    static int n;
    static int m;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }

        printRowMax(arr);
    }

    public static void printRowMax(int arr[][]) {
        for(int i=0;i<n;i++){
            int max = arr[i][0];
            for(int j=0;j<m;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}