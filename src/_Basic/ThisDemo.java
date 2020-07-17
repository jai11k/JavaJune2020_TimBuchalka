package _Basic;

public class ThisDemo
{
    int x;
    public ThisDemo(int x)
    {
        this.x=x;
    }

    public static void main(String[] args) {
        ThisDemo obj1=new ThisDemo(10);

        System.out.println("Value of x is :" +obj1.x);

    }
}
