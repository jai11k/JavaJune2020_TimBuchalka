package _Challenges.VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class LatestSeriesPattern
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num ,s=0;
        System.out.println("Enter the number : ");
        num=scanner.nextInt();
        scanner.nextLine();
         for (int i=1;i<=num;i++)
         {
             s=s*10+i;
             System.out.print(s+"+");
         }

    }
}
