package VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class IsPrimeNumOrNotRecap
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : " );
        int num;
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ____" +isPrime(num) );
    }

    public static boolean isPrime(int n)
    {
        if (n==1)
        {
            return false;

        }
        for (int i =2 ;i<=n/2;i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
