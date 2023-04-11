import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int array [] = new int [n];

        for(int i=0;i<n;i++){
            array [i] = in.nextInt();
        }

        boolean check = true;

        for(int i=1;i<n;i++){
                if(array[i - 1] > 0 && array[i] > 0){
                    check = false;
                }else if(array[i - 1] < 0 && array[i] < 0){
                    check = false;
                }
        }
        if(check == false){
            System.out.println("NO");
        }else if(check == true){
            System.out.println("YES");
        }
    }
}