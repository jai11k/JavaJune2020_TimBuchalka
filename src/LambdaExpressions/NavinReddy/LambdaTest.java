package LambdaExpressions.NavinReddy;

interface  A
        {
             void show(int i);
        }


public class LambdaTest
{
    public static void main(String[] args)
    {


                A obj1= (int i) ->
                {
                    System.out.println(i + " hello");
                };

                obj1.show(6);

    }
}
