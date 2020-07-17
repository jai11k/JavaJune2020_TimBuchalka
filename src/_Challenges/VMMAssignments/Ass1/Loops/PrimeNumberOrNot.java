package _Challenges.VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class PrimeNumberOrNot
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : " );
        int num;
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" its a "+isPrime(num) );
    }
        public static boolean isPrime(int n)
        {

        if(n == 1)
        {
            return false;
        }

        for(int i=2; i <= n/2; i++)
        {

            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
        }


}
