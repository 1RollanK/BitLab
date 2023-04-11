import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        countNumbers(arr);
    }

    public static void countNumbers(int arr []){

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.print(count);
    }
}