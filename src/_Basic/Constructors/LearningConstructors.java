package _Basic.Constructors;

public class LearningConstructors
{
    public LearningConstructors()
    {
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
//region
/*
CLass is a user defined Blueprint from which objects are created.it represents the set of methods
that are common to all objects of one type.


Objects is an instance of the class.

Constructors is  special method which is used tto  initializze objects.
constructors is called when objects of class is created It has no return type.it is called at the time of execution.

 */
//endregion