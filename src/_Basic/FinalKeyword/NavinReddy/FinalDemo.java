package _Basic.FinalKeyword.NavinReddy;

public class FinalDemo
{
    public static void main(String[] args) {

        final   int i=5;

        System.out.println(i);
        Second bj=new Second();
        bj.show();
    }

}
 class First
 {
      final public void show()
     {
         System.out.println("This is thee First class");
     }
 }
 class Second extends First
 {
//     public void show()
//     {
//         System.out.println("This is thee secoond class");
//     }
 }