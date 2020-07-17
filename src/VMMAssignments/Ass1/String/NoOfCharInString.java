package VMMAssignments.Ass1.String;

import java.util.Scanner;

public class NoOfCharInString
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s;

        System.out.println("Enter the String..... ");

        s=scanner.nextLine();

        System.out.println("total number of char are : "+s.length());


    }
    public static int countChar(String input)
    {
        int count=0;

       for (int i =0;i<input.length();i++)
       {
          count++;

       }

    return count ;
    }

}
