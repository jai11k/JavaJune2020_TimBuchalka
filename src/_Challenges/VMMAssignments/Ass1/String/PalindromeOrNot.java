package _Challenges.VMMAssignments.Ass1.String;

import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        String  orignal, rev=" " ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  the   String : ");
        orignal=scanner.nextLine();

        StringBuffer sb=new StringBuffer(orignal);

        rev=sb.reverse().toString();

      if (orignal.equals(rev))
      {
          System.out.println("Its Palindrome");
      }else
      {
          System.out.println("Not palindrome");
      }


    }
}

