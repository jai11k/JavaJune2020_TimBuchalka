package _Challenges.VMMAssignments.Ass1.Loops;

public class Patterns
{
    public static void main(String[] args)
    {
//        pattern1();

        System.out.print("\n");
        System.out.print("\n");

//        pattern2();

        System.out.print("\n");
        System.out.print("\n");

   //     pattern3();

        System.out.print("\n");
        System.out.print("\n");

        pattern4();

        System.out.print("\n");
        System.out.print("\n");

    //    pattern5();



    }

    private static void pattern1()
    {

//        55555
//        4444
//        333
//        22
//        1
        int i,j;
        for (i=6-1;i>0;i--)
        {
            for (j=i;j>0;j--)

                System.out.print(""+i);
            System.out.print("\n");
        }
    }

    private static  void pattern2()
    {
    //        5
//        54
//        543
//        5432
//        54321

    int i,j;
    for (i=5;i>=1;i--)
    {
        for (j=5;j>=i;j--)

            System.out.print(""+j);
        System.out.print("\n");
    }

}

    private static void pattern3()
    {
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

         for (int i =1;i<=5;i++)
        {
            for (int j=1; j<=i; j++)


                System.out.print(" " +i) ;

                System.out.print("\n");
        }
    }

    private static void pattern4()
    {

//        5 5 5 5 5
//        4 4 4 4
//        3 3 3
//        2 2
//        1


        for(int i=6-1;i>0;i--)
         {
             for (int j=i;j>0;j--)


                 System.out.print(" " +i) ;

                 System.out.print("\n");

             }

    }

    private  static void pattern5()
    {
                int i,j ;

        for (i=1; i<6 ;i++)
        {
            for (j=1;j<=i;j++)

                System.out.print("+");

            System.out.print("\n");
        }

    }


    private  static void pattern6()
    {

        for(int i = 1 ; i <= 5 ; i++)
        {
            for(int j = i ; j <= 5 ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void pattern7()
    {

//        *****
//        ****
//        ***
//           **
//        *


        for(int i=6-1;i>0;i--)
        {
            for (int j=i;j>0;j--)


                System.out.print("*") ;

            System.out.print("\n");

        }

    }

    private static void pattern8()
    {

//        *****
//        ****
//        ***
//           **
//        *


        for(int i=1;i<=5;i++)
        {
            for (int j=i;j<0;j++)


                System.out.print("*") ;

            System.out.print("\n");

        }

    }


}


