package _Challenges.VMMAssignments.Ass1.Decision_Making;

import java.util.Scanner;

public class CalculateStudentMarks
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Marks  of the student  : ");
        input=scanner.nextInt();
        scanner.nextLine();

        if(input >=90)
        {
            System.out.println(" A Grade...!!!  ");
        }else if (input>=80 && input<=89)
        {
            System.out.println(  " B Grade ...!!!! ");
        }else if (input>=70 && input<=79)
        {
            System.out.println( " C Grade ...!!!! ");

        }else if (input<70)
        {
            System.out.println( " D Grade... !!!!!!!!! ");
        }
    }
}
