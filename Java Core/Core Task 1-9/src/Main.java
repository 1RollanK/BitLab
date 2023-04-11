import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        oddNumbers(arr);
    }

    public static void oddNumbers (int arr[]){
        int result;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1 && arr[i]!=23){
                System.out.println(arr[i]);
            }
            if(arr[i]==23){
                break;
            }
        }
    }
}