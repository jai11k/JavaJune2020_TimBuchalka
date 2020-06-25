package VMMAssignments.Ass1.Loops;

public class PrintSeriesReharsal
{


//    1,4,7,10.....40  ali series
    public static void main(String[] args)
    {
        System.out.print(" First Series is : ");
        for (int i = 1; i <= 40; i += 3) {
            System.out.print(" " + i + ",");
        }


//       -series    1+4+9

        System.out.print(" \n ");
        System.out.print("Second Series is : ");
        for (int i = 1; i <= 10; i++)
        {
            int result = i * i;
            System.out.print(" " +result+ " +");
        }

//          series 1+8+27

        System.out.print(" \n Third Series is : ");
        for (int i=1;i<=10;i++)
        {
            int result=i*i*i;
            System.out.print(""+result+"+");
        }

        //  series 0,3,8,15 ali

        System.out.print("\n");
        System.out.print("Fourth series is : ");
        {

            int m=0,series =0,a=0 ;

            while (m<10)
            {

                series=series+3+a;
                m=m+1;
                a=a+2;
                System.out.print(series+ ",");
            }
        }


    }

}
