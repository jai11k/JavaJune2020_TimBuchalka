package _Challenges.VMMAssignments.Ass1.Basic;

import java.util.Scanner;

public class SwapUsingThirdVariable
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter two numbers");

        a=scanner.nextInt();
        scanner.nextLine();

        b=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Numbers without swaping are  " +a + " and " +b );
        c=a;
        a=b;
        b=c;
        System.out.println("Numbers  swaping are  " +a  + " and " +b );

    }


}
