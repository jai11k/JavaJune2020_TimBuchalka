package _Basic.InnerClasses;






class OuterClass1
{
    void outerMethod()
    {
        System.out.println("inside outerMethod");
                                                                       // Inner class is local to outerMethod()
        class Inner
        {
            void innerMethod()
            {
                System.out.println("inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}

public class MethodLocalInnerClass
{
    public static void main(String[] args)
    {
        OuterClass1 x = new OuterClass1();
        x.outerMethod();
    }
}
