import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        printValue(arr);
    }
    public static void printValue(int arr []) {
        for(int i = 0; i < n; i++) {
            if(arr[i]<50 && arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
    }
}