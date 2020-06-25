package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class VowelOrNotUsingIfElse
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        char input;
        System.out.println("Please Enter the Letter .. ");
        input=scanner. next().charAt(0) ;
        scanner.nextLine();

        if(input== 'a' || input =='e' || input== 'i' || input =='o' || input== 'u' || input =='A' || input == 'E' || input == 'I' || input == 'O' || input =='U')
        {
            System.out.println(" Its a Vowel" );
        }
        else
            {
                System.out.println("Its a consonent");
            }

    }
}

