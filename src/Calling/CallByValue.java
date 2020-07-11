package Calling;

public class CallByValue
{
    public static void main(String[] args)
    {
        int a=30;
        int b =45;
        System.out.println("Before Swapping : a = " +a + " and b = " +b);

        swapFunction(a,b) ;

        System.out.println("\n**Now, Before and After swapping values will be same here**: ") ;

        System.out.println("After Swapping : a = " +a + " and b = " +b);

    }
    public static void swapFunction(int a, int b)
    {

        System.out.println("Before Swaping (Inside) :  a = " +a + " and b = " +b );
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swapping (Inside) : a = " + a + " and b = "+ b);

    }
}


//  Call by value- method is called by parametr as value