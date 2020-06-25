package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CheckOddEven
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Enter the NUmber = ");
        input=scanner.nextInt();


        if(input%2==0)
        {
            System.out.println("It is an Even number ...!!!!!");

        }
        else
        {
            System.out.println("It is  a Odd number...!!!!!! ");
        }
    }
}
