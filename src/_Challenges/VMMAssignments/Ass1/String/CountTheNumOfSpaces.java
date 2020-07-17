package _Challenges.VMMAssignments.Ass1.String;

import java.util.Scanner;

public class CountTheNumOfSpaces
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Enter  the String.... ");
        s = scanner.nextLine();

        count(s);
    }

    public static void count(String s)
    {
        char[] c = s.toCharArray();
        int space = 0;

        for (int i = 1; i <= s.length(); i++)
        {
            if (Character.isSpaceChar(c[i]))
            {
                space++;
            }

        }
        System.out.println("space: " + space);

    }
}