package _OOPS.Inheritance.ExampleVehicle;

public class Vehicle {
    private String name;
    private int size;
    private int currentvelocity;
    private int currentDirection;


    public Vehicle (String name, int size)
    {
        this.name = name;
        this.size = size;

        this.currentDirection=0;
        this.currentvelocity=0;
    }
    public void steer(int direction)
    {
        this.currentDirection+=direction;
        System.out.println(this.currentDirection);
    }

    public void move(int velocity, int direction)
    {
        this.currentDirection=direction;
        this.currentvelocity=velocity;
        System.out.println(this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCurrentvelocity() {
        return currentvelocity;
    }

    public void setCurrentvelocity(int currentvelocity) {
        this.currentvelocity = currentvelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
public void stop()
{
    this.currentvelocity=0;
}


}
