package VMMAssignments.Ass1.String;



import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class NumOfWordsInAString
{
    public static void main(String[] args)
    {
String s=" jai is velly you r not ";

        countWordsMethod2(s);

          System.out.println("-->"+  countWordsMethod2(s) );;




    }

    public static void countWordsMethod1(String line)
    {


        String[] array = new String[10];
        array = line.split(" ");


        System.out.printf("Modified arr[] : %s", Arrays.toString(array));

        System.out.println("NO. of words are"+array.length);


    }


    public static int countWordsMethod2(String str)
    {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
//        System.out.println("--->"+count);
    }



}
