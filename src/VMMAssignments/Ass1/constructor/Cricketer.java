package VMMAssignments.Ass1.constructor;
//
//        Define a class Cricketer- With members Name and Country  ·
//        A default constructor  · Two parameterized constructor
//        Cricketer(String Name,String Country)
//        Cricketer(Cricketer ct)  ·
//        toStr() method to display result as – “name belongs to country”  EX- Virat Kohli belongs to India

//everythingh in javamtlb ki every class in java is datatype ...example-array,string,int,student,empolyee,bankAccount

public class Cricketer

{
      private String name;
      private String country;

    public Cricketer()
    {
        this.name="Virat kohli";
        this.country="india";
    }

    public Cricketer(String name, String country)
    {
        this.name=name;
        this.country=country;
    }

    public Cricketer(Cricketer ct)
    {
this.name=ct.name;
this.country=ct.country;
    }

    public void toStr()
    {

        System.out.println(name+" belongs to "+country);
    }



}
