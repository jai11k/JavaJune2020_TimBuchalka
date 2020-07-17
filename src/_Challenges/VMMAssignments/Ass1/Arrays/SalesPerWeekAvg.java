package _Challenges.VMMAssignments.Ass1.Arrays;


import java.util.Scanner;

public class SalesPerWeekAvg
{
//    WAP to accept sales of one week of a salesman and calculate the total sale of week and the average sale per day.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int Sales[] = new int[7];

        System.out.println(" Enter the sales of day 1 : \n");
        Sales[0] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 2 : \n");
        Sales[1] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 3 : \n");
        Sales[2] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 4 : \n");
        Sales[3] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 5 : \n");
        Sales[4] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 6 : \n");
        Sales[5] = scanner.nextInt();
        scanner.nextLine();

        System.out.println(" Enter the sales of day 7 : \n");
        Sales[6] = scanner.nextInt();
        scanner.nextLine();

        int sum = 0,average=0;


            for (int num : Sales)  //enganced for loop
            {
                sum = sum + num;
                 average = sum/7;
            }
        System.out.println("average : " + average);
    }
    }





