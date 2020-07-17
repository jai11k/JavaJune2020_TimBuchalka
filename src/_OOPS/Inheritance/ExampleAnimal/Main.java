package _OOPS.Inheritance.ExampleAnimal;

public class Main
{
    public static void main(String[] args)
    {
        	Animal anmol= new Animal(1,1,30,55,"anmol");
	Dog Anmol=new Dog(1,1,"Anmol",2,4,1,32,"black silky");

	Anmol.eat();
	Anmol.move(0);
	Anmol.walk();
	Anmol.run();

        Animal fish= new Animal(1,1,15,60,"Dolphin");
        fish.move(66);

        Animal dog=new Dog(5,56,"tommy",2,4,1,22,"coat");

    }
}
