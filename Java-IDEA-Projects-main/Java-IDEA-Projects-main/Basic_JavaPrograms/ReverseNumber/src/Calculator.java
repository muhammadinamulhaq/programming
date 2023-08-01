import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Take input from the user till the user enters X or x
        int ans = 0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = scn.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = scn.nextInt();
                int num2 = scn.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }else if(op == '-'){
                    ans =  num1 - num2;
                }else if(op == '*'){
                    ans = num1 * num2;
                }else if(op == '/'){
                    if(num2 != 0){
                        ans = num1/num2;
                    }
                }else{
                    ans = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }


    }
}
