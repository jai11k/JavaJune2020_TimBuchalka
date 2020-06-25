package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class VowelOrNotUsingSwitch
{

    public static void main(String[] args)
    {

        Scanner scanner= new Scanner(System.in);
        char input;
        System.out.println("Please Enter the Letter .. ");
        input=scanner. next(). charAt(0) ;
         scanner.nextLine();

        switch (input)
        {
            case 'A':
                System.out.println("It's a Vowel ");
                break;
            case 'E':
                System.out.println("It's a Vowel ");
                break;
            case 'I':
                System.out.println("It's a Vowel ");
                break;
            case 'O':
                System.out.println("It's a Vowel ");
                break;
            case 'U':
                System.out.println("It's a Vowel ");
                break;
            case 'a':
                System.out.println("It's a Vowel ");
                break;
            case 'e':
                System.out.println(" It's a Vowel ");
                break;
            case 'i':
                System.out.println(" It's a Vowel");
                break;
            case 'o':
                System.out.println(" It's a Vowel ");
                break;
            case 'u':
                System.out.println(" It's a Vowel ");
                break;
            default:
                System.out.println("It's consonent ...!!");
                break;
        }
    }
}


