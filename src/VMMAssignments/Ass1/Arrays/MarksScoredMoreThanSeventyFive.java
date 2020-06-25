package VMMAssignments.Ass1.Arrays;

import java.util.Scanner;

public class MarksScoredMoreThanSeventyFive
{
    public static void main(String[] args) {

        //WAP to accept a list of marks from user and print marks of those who scored more than 75.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of the students :");

        int StudentMarks[] = new int[6];


        StudentMarks[0] = scanner.nextInt();
        scanner.nextLine();

        StudentMarks[1] = scanner.nextInt();
        scanner.nextLine();

        StudentMarks[2] = scanner.nextInt();
        scanner.nextLine();

        StudentMarks[3] = scanner.nextInt();
        scanner.nextLine();

        StudentMarks[4] = scanner.nextInt();
        scanner.nextLine();

        StudentMarks[5] = scanner.nextInt();
        scanner.nextLine();

        for (int i=0;i<=StudentMarks.length;i++)
          if (StudentMarks[i] > 75)
          {

              System.out.println("Marks which are scored more than  75 are : " + StudentMarks[i]);
          }
    }
}