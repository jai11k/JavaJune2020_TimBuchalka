package _Basic.InnerClasses;
class Outer
{

    class Inner
  {
//    This is the nested inner class
        public void show()
        {
            System.out.println("In a nested class method");
        }
    }
}

public class NestedInnerClass
{
    public static void main(String[] args)
    {
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
