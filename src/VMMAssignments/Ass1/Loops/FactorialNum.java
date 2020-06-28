package VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class FactorialNum
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num;
        num=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Factorial of Number -" +num+ " is " +factorial(num)  );


    }
    public static int factorial(int n)
    {
          if (n==0)
          {
              return 1;

          }
          else
              {
               return n*factorial(n-1);
              }
    }
}


