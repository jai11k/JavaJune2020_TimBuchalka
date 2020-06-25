package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class PrintGoodAverageAccordingToNumber
{

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Accept Number from the User between 1-10 : ");
        input=scanner.nextInt();
        scanner.nextLine();
        if(input>=1 && input<=5)
        {
            System.out.println(" Average ");
        }
        else if (input==6 || input==7)
        {
            System.out.println("Good");
        }
        else if (input==8 ||input==9)
        {
            System.out.println("Good");
        }
        else if (input==10)
        {
            System.out.println("Excellence");
        }
        else
        {
            System.out.println("Error");
        }
    }

}

