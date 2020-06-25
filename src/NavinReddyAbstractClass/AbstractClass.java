package NavinReddyAbstractClass;

public class AbstractClass
{
    public static void main(String[] args)
    {
        HiteshPhone obj =new HiteshPhone ();
        {

           obj.move();

        }
    }

}
    abstract class MaheshPhone
    {
        public void call()
        {
            System.out.println("Call method runs...");
        }
         public abstract  void move();
         public abstract  void dance();
         public abstract  void run();
    }

   class HiteshPhone extends MaheshPhone
   {
       public void dance() {
           System.out.println("Dance method runs...!!");
       }
       public void run()
       {
           System.out.println("Run method also runs ...!!!!");
       }
       public void move()
       {
           System.out.println("Move method also runs ...!!!!");
       }
   }
