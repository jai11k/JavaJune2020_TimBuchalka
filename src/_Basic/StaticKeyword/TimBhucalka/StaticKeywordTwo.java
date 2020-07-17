package _Basic.StaticKeyword.TimBhucalka;

public class StaticKeywordTwo
{

    public static void main(String[] args)
    {
        Doggy  dog1=new Doggy("anmol") ;
        Doggy dog2=new Doggy("Anmol");
        dog2.dogName();
        dog1.dogName();
    }
}



class Doggy
{
    private static String name;

    public Doggy(String name)

    {
        Doggy.name=name;
    }

    public void dogName()
    {
        System.out.println("Name = " +name);
    }
}