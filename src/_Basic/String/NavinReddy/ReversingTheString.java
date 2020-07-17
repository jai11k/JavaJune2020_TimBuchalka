package _Basic.String.NavinReddy;

import java.util.Scanner;

public class ReversingTheString
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        String orignal;
        String rev =" " ;

        System.out.println("Enter the String to reverse : ");
        orignal=scanner.nextLine();



//        First method

//        int len=orignal.length();
//        for (int i=len-1;i>=0;i--)
//        {
//            rev=rev+orignal.charAt(i);
//
//        }

//       2nd Method is by Standard JAVA API
//
//        StringBuffer sb=new StringBuffer(orignal);
//        rev=sb.reverse().toString();



        System.out.println(" Orignal String = "+orignal);


        System.out.println(" Reverse of the  String = "+rev);

    }
}
