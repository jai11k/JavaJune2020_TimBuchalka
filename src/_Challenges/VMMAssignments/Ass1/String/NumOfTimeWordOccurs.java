package _Challenges.VMMAssignments.Ass1.String;

import java.util.Scanner;

public class NumOfTimeWordOccurs
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String string;
        int count=0;
        System.out.println("Enter the String");
        string=scanner.nextLine();
        String word="the";
        String newName[]=string.split(" ");

        for (int i=0;i<newName.length;i++)
        {
            if (word.equals(newName[i]))
                count++;
        }

        System.out.println("'The' word"+" occurs " + count + " times  in the String....");
    }
}
