package _Challenges.VMMAssignments.Ass1.Loops;


import java.util.Scanner;

public class SumOfOddAndEvenNo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       int num=0, sumEven = 0,sumOdd=0;

        System.out.println("Enter the number  : ");

        num = scanner.nextInt();
        scanner.nextLine();

        for ( int i =1; i <= num; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("\n");
                System.out.println("numbers being added"+i);
                sumEven = sumEven + i ;
            }
        else
            {
                sumOdd = sumOdd + i;
            }

        }
        System.out.println("Sum of " +num+ " even number is  = " +sumEven);

        System.out.println("Sum of "+num + " odd number is  = " +sumOdd);
    }
}