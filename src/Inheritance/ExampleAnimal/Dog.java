package Inheritance.ExampleAnimal;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(  int size, int weight, String name,int eyes,int legs,int tail,int teeth,String coat)
    {
        super(1,1, size, weight, name);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;


    }
    private void chew()
    {
        System.out.println("Dog.chew() called ");
    }

    @Override
    public void eat()
    {
        super.eat();
        System.out.println( "Dog.eat() called ");
    }

    public void walk()
    {
        System.out.println("Dog.walk() is called");
        super.move(5);
    }
    public void run()
    {
        System.out.println("Dog.run() is called ");
        super.move(15);
    }
}
