package Thread.Vmm;

class D implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread D "+i);
        }
        System.out.println("Thead D Complete");
    }
}

class E implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread E "+i);
        }
        System.out.println("Thead E Complete");
    }
}


class F implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From Thread F "+i);
        }
        System.out.println("Thead F Complete");
    }
}


//better than Extends thread bcz
public class ThreadDemoUsingRunnableInterface
{
    public static void main(String[] args)
    {


        D job1=new D();
        E job2=new E();
        F job3=new F();

        Thread t1=new Thread(job1);
        Thread t2=new Thread(job2);
        Thread t3=new Thread(job3);

        t1.start();
        t2.start();
        t3.start();
    }

}
