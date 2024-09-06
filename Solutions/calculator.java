package Solutions;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter the operator:");
            char op = sc.next().charAt(0);

            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("enter two number:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                switch (op) {
                    case '+':
                        ans = num1 + num2;
                        break;

                    case '-':
                        ans = num1 - num2;
                        break;

                    case '/':
                        if (num2 < 1) {
                            ans = num1 / num2;
                            break;
                        }

                    case '*':
                        ans = num1 * num2;
                        break;

                    case '%':
                        ans = num1 % num2;
                        break;

                    default:
                        break;
                }

                System.out.println("Ans is:" + ans);
            }

            else if (op == 'x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
        
        }


        sc.close();
    }
}
