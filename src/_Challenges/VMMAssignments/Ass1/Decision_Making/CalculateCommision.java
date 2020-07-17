package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CalculateCommision
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int input;

        System.out.println("Enter the sale amount : ");

        input=scanner.nextInt();
        scanner.nextLine();


        if (input>=30001)
        {
            System.out.println(" Your Commision is 15 % ..... " );
        }
        else if (input>=22001 && input<= 30000 )
        {
            System.out.println(" Your Commision is 10 % ..... " );
        }
        else if (input>=12001 && input<= 22000 )
        {
            System.out.println(" Your Commision is 7 % ..... " );
        }
        else if (input>=5001 && input<= 12001 )
        {
            System.out.println(" Your Commision is 5 % ..... " );
        }
        else if (input>=0 && input<= 5000 )
        {
            System.out.println(" Your Commision is 0 % ..... " );
        }
        else
        {
            System.out.println(" Error ");
        }
    }
}
