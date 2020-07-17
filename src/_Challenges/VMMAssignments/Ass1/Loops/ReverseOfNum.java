package _Challenges.VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class ReverseOfNum
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

         System.out.println("enter the number : ");
         int num;
        num=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Answer is  : "+revNumber(num));

    }
    public static int revNumber( int num)
    {
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
