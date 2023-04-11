import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int arr [] = new int [a];

        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }

        System.out.print(mean(arr));
    }

    public static int mean (int arr[]){
        int sum = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        int mean = sum/count;
        return mean;
    }
}