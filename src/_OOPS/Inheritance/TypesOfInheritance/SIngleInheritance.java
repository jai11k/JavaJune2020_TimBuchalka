package _OOPS.Inheritance.TypesOfInheritance;



 class First
{
    public void printLine()
    {
        System.out.println("Karan");

    }
}
class Second extends First{
     public void printSecond()
     {
         System.out.println("Ghai");
     }
}
public class SIngleInheritance {

    public static void main(String[] args) {

        Second print1 = new Second();
          print1.printLine();
        print1.printSecond();
    }
}
