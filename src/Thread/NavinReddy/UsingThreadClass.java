package Thread.NavinReddy;


  class Hii extends Thread
  {
      @Override
      public void run()
      {
          for (int i = 1; i < 50; i++) {
              System.out.println("Hii...!!!!!");
              try {
                    Thread.sleep(1000);
              } catch (InterruptedException e)
              {

              }
          }
      }
  }

class Hlo extends Thread
{
    public void run()
    {
        for (int i = 1; i < 50; i++) {
            System.out.println("Hlo..!!!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {

            }
        }
    }
}
public class UsingThreadClass
{
    public static void main(String[] args) {
        Hii obj1=new Hii();
        Hlo obj2=new Hlo();
        obj1.run();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e)
        {

        }
        obj2.run();




    }
}

