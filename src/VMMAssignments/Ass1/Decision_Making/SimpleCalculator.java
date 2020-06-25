package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char ch;
        double num1, num2;
        System.out.println("Please Enter two numbers : ");
        num1 = scanner.nextDouble();
        scanner.nextLine();
        num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Select the following opearators :  '+' '-' '*' '/' '%' ");
        ch = scanner.next().charAt(0);
        scanner.nextLine();
        double output=0;

//        output = scanner.nextDouble();
//        scanner.nextLine();

        switch (ch)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            case '%':
                output = num1 % num2;
                break;

            default:

                System.out.println(" You have entered wrong operator");
                break;
        }
        System.out.println("=====>"+num1 + " " + ch + " " + num2 + "=" + output);


    }
}
