package Inheritance.ExampleAnimal;

public class Fish extends Animal
{
    private int gills;
    private int fins;
    private int eyes;

    public Fish( int size, int weight, String name, int gills, int fins, int eyes)
    {
        super(1, 1, size, weight, name);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }
    private  void rest()
    {

    }
    private void moveMuscles()
    {

    }
    private  void  moveBackfin()
    {

    }
    private  void swim(int speed)
    {
            moveBackfin();
            moveMuscles();
            super.move(speed);
        System.out.println("Fish is moving at " +speed );
    }


}
