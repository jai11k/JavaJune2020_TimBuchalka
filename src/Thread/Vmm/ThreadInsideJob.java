package Thread.Vmm;


class myjob implements Runnable
{
    String name;
    Thread t;
    myjob(String n)
    {
        name=n;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <=2000 ; i++)
        {
            System.out.println("From"+name+" "+i);
        }
        System.out.println(name+" complete");
    }
}

public class ThreadInsideJob
{
    public static void main(String[] args)
    {
    myjob job1=new myjob("ONE");
    myjob job2=new myjob("TWO");
    myjob job3=new myjob("THREE");
    }
}
