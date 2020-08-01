package _Challenges.TimBuchalka.BasicChallenges.ArrayChallenege;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChallenge
{
    public static void main(String[] args)
    {

   int[] newIntegers=getIntegers(4);
        int[] integers = sortIntegers(newIntegers);
        printArray(integers);



    }
     public static int[] getIntegers(int numbers)
     {
         int[] list=new int[numbers];

         System.out.println("Enter the numbers...!!!!!! ");


         for (int i = 1; i <list.length ; i++)
         {
             Scanner scanner=new Scanner(System.in);
             list[i] = scanner.nextInt();


         }


         return list;
     }

     public static void  printArray(int[] numbers)
     {
         for (int i = 1; i < numbers.length ; i++)
         {

             System.out.println("Element = " +i + "Value = "+numbers[i]);
         }

     }
      public static int[] sortIntegers( int[] numbers)
      {
        int[] sortedNumbers=new int[numbers.length];
          for (int i = 1; i <numbers.length ; i++)
          {
              sortedNumbers[i]= numbers[i];

          }
          boolean flag=true;
          int temp;
          while (flag)
          {
              flag=false;

              for (int i = 1; i <=sortedNumbers.length ; i++) {
                  if (sortedNumbers[i] < sortedNumbers[i + 1])
                  {
                      temp=sortedNumbers[i];
                      sortedNumbers[i]=sortedNumbers[i+1];
                      sortedNumbers[i+1]=temp;
                      flag=true;

                  }
              }

              }
          return sortedNumbers;

          }
          }


