package InnerClasses;
  class Demo
  {
      void show()
      {
          System.out.println("I m in parent class");
      }
  }
  class DemoNew
  {
      static Demo demo=new Demo();

      public DemoNew()
      {
          super();
          {
              show();
          }
      }


      void show()
      {

          System.out.println("I am in the child class...!!!!! ");
      }
  }
public class InnerClass
{
    public static void main(String[] args)
    {
        DemoNew demo1=new DemoNew();

        demo1.show();
    }
}
