import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printSeason(n);
    }
    public static void printSeason(int n) {
        if(n==12 || n==1 || n==2){
            System.out.print("Winter");
        }
        if(n==3 || n==4 || n==5){
            System.out.print("Spring");
        }
        if(n==6 || n==7 || n==8){
            System.out.print("Summer");
        }
        if(n==9 || n==10 || n==11){
            System.out.print("Autumn");
        }
    }
}