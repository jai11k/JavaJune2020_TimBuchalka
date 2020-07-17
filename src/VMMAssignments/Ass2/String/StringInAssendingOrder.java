package VMMAssignments.Ass2.String;

import java.util.Scanner;

public class StringInAssendingOrder
{
    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        String s;
        System.out.println("Enter a string..!!!!!");
        s=scanner.nextLine();


        char value[]=s.toCharArray();

        for (int i = 0; i < value.length; i++)
        {
            for (int j = i ; j < value.length; j++)
            {
                if (Character.toLowerCase(value[j]) < Character.toLowerCase(value[i]))
                {
                    swapChars ( i, j, value);
                }
            }
        }
        System.out.println("Sorted String : " +String.valueOf(value));

    }

    private static void swapChars(int i, int j, char[] value) 
    {
        char temp = value[i];
        value[i] = value[j];
        value[j] = temp;
    }
    
}
