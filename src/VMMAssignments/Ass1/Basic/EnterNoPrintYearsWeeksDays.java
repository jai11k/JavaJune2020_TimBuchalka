package VMMAssignments.Ass1.Basic;

import java.util.Scanner;

public class EnterNoPrintYearsWeeksDays
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter two numbers");

        a=scanner.nextInt();
        b=scanner.nextInt();
        System.out.println("Numbers without swaping are  " +a + " and " +b );
        c=a;
        a=b;
        b=c;
        System.out.println("Numbers  swaping are  " +a  + " and " +b );
    }
}
