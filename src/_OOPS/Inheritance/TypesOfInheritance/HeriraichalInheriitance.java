package _OOPS.Inheritance.TypesOfInheritance;

class FirstClass
{
    public void print1()
    {
        System.out.print( " Bhaag ");
    }
}

class SecondClass extends FirstClass
{
    public void print2()
    {
        System.out.print(" Milkha");
    }
}
class ThirdClass extends FirstClass
{

}



public class HeriraichalInheriitance
{
    public static void main(String[] args)
    {

        ThirdClass printnew=new ThirdClass();

        SecondClass print2=new SecondClass();

        printnew.print1();
        print2.print2();
        printnew.print1();


    }
}
