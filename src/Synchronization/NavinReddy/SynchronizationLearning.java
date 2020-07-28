package Synchronization.NavinReddy;
   class Test
   {
       int count;
       public  synchronized void increment()
       {
           count++;
       }

   }
public class SynchronizationLearning
{
    public static void main(String[] args) throws InterruptedException
    {
        Test t1=new Test();

        Thread obj1 =new Thread(new Runnable()
        {

            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++)
                {
                           t1.increment();
                }
            }
        });

        obj1.start();
        obj1.join();



        Thread obj2=new Thread(new Runnable()
        {

            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++)
                {
                    t1.increment();
                }
            }
        });


       obj2.start();
        obj2.join();
        System.out.println("Count = " + t1.count);
    }
}
