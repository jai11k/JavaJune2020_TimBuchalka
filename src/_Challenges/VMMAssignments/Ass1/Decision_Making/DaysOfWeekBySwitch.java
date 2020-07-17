package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class DaysOfWeekBySwitch
{

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int input;
        System.out.println("Please Enter the Number.. ");
        input=scanner.nextInt();
        scanner.nextLine();

        switch (input)
        {
            case 1:
                System.out.println(" Day is Monday");
                break;
            case 2:
                System.out.println(" Day is Tuesday");
                break;
            case 3:
                System.out.println(" Day is  Wednesday");
                break;
            case 4:
                System.out.println(" Day is Thursday");
                break;
            case 5:
                System.out.println(" Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println(" Day is Sunday");
                break;
            default:
                System.out.println("Please enter No. from 1-7 ..!!");

        }
    }
}


