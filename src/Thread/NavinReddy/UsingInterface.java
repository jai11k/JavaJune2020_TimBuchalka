package Thread.NavinReddy;



class Hi implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <50 ; i++) {
            System.out.println("Hi...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {

            }
        }

    }
}
  class Hello implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <50 ; i++) {
            System.out.println("Hlo...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {

            }
        }

    }
}

public class UsingInterface
{
    public static void main(String[] args) {
        Hii obj=new Hii();
        Hlo obj1=new Hlo();

        obj.run();
        obj1.run();
    }
}
