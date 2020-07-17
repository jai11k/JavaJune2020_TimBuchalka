package _Challenges.VMMAssignments.Ass2.String;

import java.util.Scanner;

public class FrequencyOfEachElement
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);


         String str;
        System.out.println("Enter the string...");
        str=scanner.nextLine();

            int[] freq = new int[str.length()];
            int i, j;


          char string[] = str.toCharArray();
           for(i = 0; i <str.length(); i++)
         {
               freq[i] = 1;

              for(j = i+1; j <str.length(); j++)
              {
                if(string[i] == string[j])
                {
                  freq[i]++;

                string[j] = '0';
        }
    }
}


        System.out.println("Characters and their frequency");
        for(i = 0; i <freq.length; i++)
        {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }

}
}

