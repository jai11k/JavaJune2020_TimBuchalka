package _Challenges.VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class FibonaccSeries
{
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Number : ");
            int num;
            num=scanner.nextInt();
            scanner.nextLine();

            int  t1 = 0, t2 = 1;
            System.out.print("First " + num + " terms: ");

            for (int i = 1; i <= num; ++i)
            {
                System.out.print(t1 + " + ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }


        }


    }

