package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class FindGreatestof3No
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter three Numbers .... : ");

        a=scanner.nextInt();
        scanner.nextLine();
        b=scanner.nextInt();
        scanner.nextLine();
        c=scanner.nextInt();
        scanner.nextLine();


        if (a>b && a>c)
        {
            System.out.println("a is greater than all... !!! " );
        }
        else if (b>c && b>a)
        {
            System.out.println(" b is greater than all..!!! ");
        }
        else if (c>a && c>b)
        {
            System.out.println("c is greater than all ...!!! ");
        }
    }
}
