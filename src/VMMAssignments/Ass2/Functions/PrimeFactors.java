package VMMAssignments.Ass2.Functions;

import java.util.Scanner;

public class PrimeFactors
{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :  ");
        num=scanner.nextInt();
        scanner.nextLine();

        int ans=getPrime(num);




    }

    public static int getPrime(int number)
    {
     for (int i=2;i<number;i++)
     {
         while (number%i==0)
         {
             System.out.println(i+" ");
             number=number/i;
         }
     }
     if (number>2)
     {
         System.out.println(number);
        }
        return number;
    }
}
