package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CheckPositiveNegativeNo
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("Please Enter a Number : ");
        input=scanner.nextInt();
        scanner.nextLine();

        if(input==0)
        {
            System.out.println("It is a 0...!!!! ");
        }
        else if ( input>0 )
        {
            System.out.println("It is a +Ve Number.....!!!!!");
        }
        else if (input<0)
        {
            System.out.println("It is a -ve Number ...!!!!! ");
        }
    }
}
