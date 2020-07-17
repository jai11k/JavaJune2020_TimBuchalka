package _Basic.Constructors;

public class LearningConstructors
{
    public LearningConstructors() {
        VIPcoustmer person1=new VIPcoustmer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());

        VIPcoustmer person2=new VIPcoustmer("karanbir",265598.26);
        System.out.println(person2.getName());
        System.out.println(person2.getEmail());

        VIPcoustmer person3=new VIPcoustmer("Anmolpreet",568925.33,"anmol@gmail");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
        System.out.println(person3.getCreditLimit());

    }
}
