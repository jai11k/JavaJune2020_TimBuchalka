package _Challenges.VMMAssignments.Ass1.Loops;

public class PrintSeries
{
    public static void main(String[] args)
    {
        //series1
        //
       printSeries1();

        //series2
        //
     //   printSeriea2();

        //series3
        //
        printSeries3();

        //series4
        //0, 3, 8, 15
        //pehle 3 da gap fer 5 da fer 7 da fer 9 da
//       printSeries4_Way1();
//       printSeries_Way2();
//      printSeries4_Way3();

       printSeries5();

       //1+3+7+15+31
       // pehle 2 da gap,fir 4 da gap,fir 8 da gap
  //      printSeries5();







    }


    private static void printSeries1()
    {
        System.out.print("Numbers are : ");
        for (int i = 1; i <= 40; i += 3)
        {
            System.out.print(" " + i);
        }
    }

    private  static  void printSeriea2()
    {
        System.out.printf("\n");
        System.out.print(" Second Series is : ");
        for (int i = 1; i <= 10; i++)
        {
            int result = i * i;
            System.out.print("  " + result+" +");
        }
    }


    private static void printSeries3()
    {

        System.out.printf("\n");
        System.out.print(" Third Series is : ");
        for (int i = 1; i <= 10; i++)
        {
            int result = i * i * i;
            System.out.print(" " + result);
        }

    }


    private static void printSeries4_Way1()
    {
        //0, 3, 8, 15
        //pehle 3 da gap fer 5 da fer 7 da fer 9 da
        System.out.printf("\n");
        System.out.print(" Fourth Series is : ");

        int sum = 0;
        for (int i = 1; i <= 20; i += 2)
        {
            if (i == 1)
                continue;
            sum = sum + i;
            System.out.print(" "+ sum);
        }
    }


    private static void printSeries_Way2()
    {
        //series4 //repeat
        //0, 3, 8, 15
        //pehle 3 da gap fer 5 da fer 7 da fer 9 da
        System.out.printf("\n");
        System.out.print(" Fourth Series is- - : ");

        int m=0,series=0,o=0; // variable declaration
        // while loop to repeat the process 10 times.
        while(m<10)
        {
            System.out.print(series+", "); // Print the series
            series=series+3+o; // Make the series
            m=m+1; // increment operator
            o=o+2; // increase for series
        }

    }


    private static void printSeries4_Way3()
    {
        //series4 repeat
        System.out.printf("\n");
        System.out.printf("\n");
        System.out.print("Fourth Series is : ");
        int n;
        int x = 3;
        int s = 0;
        for (n=0;n<10;n++)
        {
            System.out.print(" "+s);
            s = s + x;
            x = x + 2;
        }
    }

    private static void printSeries5()
    {
        System.out.printf("\n");
        System.out.print("Fifth Series is : ");
        int num;
        int p = 2;
        int q = 1;
        for (num=0;num<10;num++)
        {
            System.out.print(" "+q);
            q = q + p;
            p = p * 2;
        }
    }

}