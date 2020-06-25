package VMMAssignments.Ass1.Basic;

import java.util.Scanner;

public class SwapWIthoutUsingThirdVariable
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int a,b ;

        System.out.println("Enter two numbers");

        a=scanner.nextInt();
        scanner.nextLine();

        b=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Numbers without swaping are  " +a + " and " +b );
        a=a+b;        //12->12+15=27
        b=a-b;       //15->27-12=15
        a=a-b;        //27-> 27-15=12
        System.out.println("Numbers  swaping are  " +a  + " and " +b );
    }
}
