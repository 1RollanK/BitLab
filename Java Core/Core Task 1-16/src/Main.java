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

        printMinMax(arr);
    }

    public static void printMinMax(int arr []) {
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}