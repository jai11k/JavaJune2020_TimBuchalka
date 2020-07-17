package Interfaces.NavinReddy;

public class Main
{
    public static void main(String[] args)
    {
            ClassDemo obj=new ClassDemo()
        {
            public void show()
            {
                System.out.println("in show");
            }
        };
        obj.show() ;
    }
}
