package VMMAssignments.Ass1.String;

import java.util.Scanner;

public class NoOfWordInString
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String s;
        System.out.println("Enter the String..... ");
        s=scanner.nextLine();
        countWordsUsingSplit(s);

    }
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }

}
