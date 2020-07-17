package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CheckUpperOrLowerCaseOrDigit
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        char input;
        System.out.println( " Enter only one alphabet : " );
        input = scanner.next().charAt(0);

        if(input>=65 && input<= 90 )
        {
            System.out.println("Uppercase");
        }
        else if (input>=97 && input<= 122)
        {
            System.out.println("Lower Case");
        }
        else if(input>=48 && input<= 57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Other charater");
        }

    }
}
