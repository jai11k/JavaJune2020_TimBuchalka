package _Basic.StaticKeyword.NavinReddy;

class Empploye {
  private    static int eid;
    static int salary;
      static  String ceoName;

    public Empploye(int eid, int salary) {
        Empploye.eid=eid;
        Empploye.salary=salary;
    }

    public static void show()
    {
        System.out.println( eid+ ";" +salary+ " = " +ceoName+ " =");
    }
}

public class NaveenReddyStaticNonStaticDiff
{


    public static void main(String[] args) {

        Empploye karan = new Empploye(4450,1235);
        karan.ceoName="Sidhu";

        Empploye Employe2=new Empploye(114,565865);

        Employe2.ceoName="Aman";

        karan.show();
        Employe2.show();


    }
}
