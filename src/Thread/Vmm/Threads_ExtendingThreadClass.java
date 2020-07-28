package Thread.Vmm;

class A extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread A "+i);
        }
        System.out.println("Thead A Complete");
    }
}

class B extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread B "+i);
        }
        System.out.println("Thead B Complete");
    }
}

class C extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread C "+i);
        }
        System.out.println("Thead C Complete");
    }
}

public class Threads_ExtendingThreadClass
{
    public static void main(String[] args)
    {
    A objA=new A();
    B objB=new B();
    C objC=new C();

    objA.start();
    objB.start();
    objC.start();
    }
}