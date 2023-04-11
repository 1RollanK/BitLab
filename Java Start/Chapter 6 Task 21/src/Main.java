import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        int x=0;
        int y=0;
        int result=0;
        int temp=0;
        char operator = ' ';

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                temp = temp * 10 + (ch - '0');
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                operator = ch;
                x = temp;
                temp = 0;
            }
        }

        y=temp;

        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.print(result);
    }
}