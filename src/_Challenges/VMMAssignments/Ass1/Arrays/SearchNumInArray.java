package _Challenges.VMMAssignments.Ass1.Arrays;

import java.util.Arrays;
import java.util.Scanner;


// Given a list of 10 numbers.    7, 9, 6, 10, 2, 1, 3, 5, 8, 4.  WAP to accept a number from user and search it in the given list.
// If the number is found prints its position the list otherwise print not found. (Linear Search)


public class SearchNumInArray {
    public static void main(String[] args)
    {


        int[] Array=new int[] {7,9,6,10,2,1,3,5,8,4};

        for(int i=0;i<=Array.length-1;i++)
        {
            System.out.println("Elements are :{" + Array[i] + "}");
        }

        System.out.println("enter no. to srch :-");
        Scanner scanner=new Scanner(System.in);
        int toFind=scanner.nextInt();
        scanner.nextLine();
       Arrays.asList(Array);

//        boolean found = false;
//
//        for (int n : _Basic.Array)
//        {
//            if (n == toFind)
//            {
//                found = true;
//                break;
//            }
//        }
//
//        if(found)
//            System.out.println(toFind + " is found.");
//        else
//            System.out.println(toFind + " is not found.");
//


    }

}
