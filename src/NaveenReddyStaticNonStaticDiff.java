
class karan {
  private    static int eid;
    static int salary;
      static  String ceoName;

    public karan(int eid,int salary) {
        karan.eid=eid;
        karan.salary=salary;
    }

    public static void show()
    {
        System.out.println( eid+ ";" +salary+ " = " +ceoName+ " =");
    }
}

public class NaveenReddyStaticNonStaticDiff
{


    public static void main(String[] args) {

        karan Employe1 = new karan(4450,1235);
        Employe1.ceoName="Sidhu";

        karan Employe2=new karan(114,565865);

        Employe2.ceoName="Aman";

        Employe1.show();
        Employe2.show();


    }
}
