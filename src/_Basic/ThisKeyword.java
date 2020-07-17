package _Basic;

public class ThisKeyword
{
    int x;
    public ThisKeyword(int x)
    {
        this.x=x;
    }

    public static void main(String[] args) {
        ThisKeyword obj1=new ThisKeyword(10);

        System.out.println("Value of x is :" +obj1.x);

    }
}
