package StaticKeyword.TimBhucalka;

public class StaticcKeyword
{

    public static void main(String[] args)
    {
        Calculator.printSum(55,45);
        printHello();


         printSub newSub=new printSub();

          int answer = newSub.ans(55,40);

        System.out.println("answeer = " +answer);


        System.out.println("\n \n This is the differnece of using static and non static keyword .Read whole pogram and you will find difference");

    }

        public static void printHello()

        {
            System.out.println("Hello,This is the suum....!!!!");

        }
    }

class printSub
{


    public int ans(int a, int b)
    {

        return (a-b);
    }
}

class Calculator
{
    public static void printSum(int a,int b)
    {
        System.out.println("Sum = " +(a+b));

    }
}

