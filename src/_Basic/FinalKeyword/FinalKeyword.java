package _Basic.FinalKeyword;




class A
{
     final void display()
    {
         System.out.println("Answer is A");
    }
}
class B extends A
{

//    void display()
//{
//    System.out.println("Answer is B");
////}
}
public class FinalKeyword
{
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
    }
}
