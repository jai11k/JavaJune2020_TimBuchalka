package Inheritance.TypesOfInheritance;


class One
{
    public void print1()
    {
        System.out.print("Karan");
    }
}
  class Two extends FirstClass {
    public void print2()
    {
        System.out.print("Bir");
    }

}
class Three extends SecondClass {
    public void print3()
    {
        System.out.print(" Singh");
    }
}
public class MutlilevelInheritance
{
    public static void main(String[] args)
    {
        Three printnew=new Three();
        printnew.print1();
        printnew.print2();
        printnew.print3();

    }
}
