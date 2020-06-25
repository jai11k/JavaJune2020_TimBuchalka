package VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CalculateBillsOftheCoustmer
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int call;
        System.out.println("Please Enter calls : ");
        call = scanner.nextInt();
        scanner.nextLine();

        if (call <= 100)
        {
            System.out.println(" Calling is free ..!!");
        }
        else if (call > 101 && call <= 200)
        {
            double output = call * 0.40;
            System.out.println("Total bill is : " + output + " Rs");

        }
        else if (call > 201 && call <= 300)
        {
            double output = call * 0.80;
            System.out.println("Total bill is : " + output + " Rs");
        }
        else if (call > 301) {
            double output = call * 1.20;
            System.out.println("Total bill is : " + output + " Rs");
        }
        else {
            System.out.println("Error");
        }
    }

}


