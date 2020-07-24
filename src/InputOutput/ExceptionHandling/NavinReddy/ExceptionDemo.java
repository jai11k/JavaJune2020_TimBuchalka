package InputOutput.ExceptionHandling.NavinReddy;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
          int k=0,i=8,j=0;
        int a[]=new int[4];
          try
          {

              k = i / j;
              for (int p = 0; p <=4 ; p++)
              {
                  a[p]=p+1;
              }
              for (int value : a)
              {
                  System.out.println(value);
              }
          }
          catch (ArithmeticException e)
          {
              System.out.println("Can't divided by Zero.. " +e);
          }
          catch (ArrayIndexOutOfBoundsException e)
          {
              System.out.println("_Basic.Array can have only 4 elements" +e);
          }
        System.out.println(k);


        }
    }

