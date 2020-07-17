package _Challenges.VMMAssignments.Ass2.Functions;

import java.util.Scanner;

public class PowerUsingRecursion
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int baseNum,powerNum;
        System.out.println("Enter  Base number  and Power number ");
       baseNum=scanner.nextInt();
       scanner.nextLine();
       powerNum=scanner.nextInt();
       scanner.nextLine();

        int result = getPower(baseNum,powerNum);
        System.out.println("Power is : " +result);

    }


    public static int getPower(int baseNum,int PowerNum)
    {
            if (PowerNum !=0)

            {
                return (baseNum*getPower(baseNum,PowerNum-1));
            }
            else
            {
                return 1;
            }

    }
}

