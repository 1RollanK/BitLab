import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int num1 = 0;
        int num2 = 0;
        char operator = ' ';
        String output = "";

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                if(operator == ' '){
                    num1 = num1 * 10 + (ch - '0');
                } else {
                    num2 = num2 * 10 + (ch - '0');
                }
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operator = ch;
            }
        }

        switch(operator){
            case '+':
                output = Integer.toString(num1 + num2);
                break;
            case '-':
                output = Integer.toString(num1 - num2);
                break;
            case '*':
                output = Integer.toString(num1 * num2);
                break;
            case '/':
                if(num2 != 0){
                    output = Integer.toString(num1 / num2);
                } else {
                    output = "Error: division by zero";
                }
                break;
            default:
                output = "Error: invalid operator";
        }

        System.out.println(output);
    }
}