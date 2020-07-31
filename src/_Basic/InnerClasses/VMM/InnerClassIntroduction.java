package _Basic.InnerClasses.VMM;

  class VaddiClass
{
    int a;
    int b;

    void  text()
    {
       InnerClass obj=new InnerClass();
       int var1=obj.c;
       obj.display();
    }

     class InnerClass
    {
        int c;
        void display()
        {
            System.out.println(a);
            System.out.println(b);
            text();
        }
    }
}
public class InnerClassIntroduction
{
    public static void main(String[] args)
    {
        VaddiClass vaddiClass=new VaddiClass();
        VaddiClass.InnerClass obj=vaddiClass.new InnerClass();
    }
}


