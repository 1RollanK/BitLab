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

        printUniqueElements(arr);
    }

    public static void printUniqueElements(int arr []) {
        boolean isDuplicate;
        for(int i = 0; i < n; i++) {
            isDuplicate = false;
            for(int j = 0; j < n; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}