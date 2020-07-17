package _Challenges.VMMAssignments.Ass1.String;

import java.util.Scanner;

public class CountVowelsFromTheString
{
    public static void main(String[] args)
    {
        Scanner  scanner=new Scanner(System.in) ;
          String s;
          int vowels=0 ,consonents=0;
        System.out.println("Enter the word : ") ;
          s=scanner.nextLine();
          s=s.toLowerCase();
          for (int i=0;i<=s.length();i++)
          {
              char word = s.charAt(i);
              if (word=='a'|| word=='e'||word=='i'||word=='o'||word=='u')
              {
                  vowels++;
              }
              else if (word>='a'&& word<= 'z')
              {
                  consonents++;

              }

              System.out.println("Vowels are : "+vowels);
              System.out.println("Consonents are : "+consonents);

          }
    }
}
