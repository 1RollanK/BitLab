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

        findSum(arr);
    }

    public static void findSum(int arr []){

        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%5!=0){
                sum+=arr[i];
            }
        }
        System.out.print(sum);
    }
}