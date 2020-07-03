package StaticKeyword.TimBhucalka;

public class StaticcKeyword
{

    public static void main(String[] args)
    {
        Calculator.printSum(55,45);
        printHello();
    }

        public static void printHello()

        {
            System.out.println("Hello");

        }
    }




class Calculator
{
    public static void printSum(int a,int b)
    {
        System.out.println("Sum = " +(a+b));

    }
}

