package _Challenges.VMMAssignments.Ass1.Loops;

import java.util.Scanner;

public class SumOfPositiveNumNegativeNumPostiveOddNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int num, posEvenNum=0,negNum=0,posOddNum=0;
        System.out.println("Enter the Num : ");
        num=scanner.nextInt();
        scanner.nextLine();

        while(true)
        {
           if(num==0)
           {
               System.out.println("Error");
               break;
           }
           else  if(num<0)
           {
               for (int i = 0; i >= num; i--)
               {
                   negNum=negNum+i;
               }
               System.out.println("Negative no. sum="+negNum);
               break;

           }
           else
           {

               for ( int i =1; i <= num; i++)
               {
                   if (i % 2 == 0)
                   {
                       posEvenNum = posEvenNum + i ;
                   }
                   else
                   {
                       posOddNum = posOddNum + i;
                   }

               }

if(posEvenNum!=0){

    System.out.println("Positive even no. sum="+posEvenNum);
}
else{

    System.out.println("postive  odd no. sum="+posOddNum);
}
break;
           }

        }
    }
}
