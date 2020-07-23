package AbstractClass.TimBhuchalka;

 abstract public class Animal
{
    private String name;

    public Animal(String name) {
        this.name = name;
    }


    abstract public void eat();
    abstract public void breathe();

    public String getName()
    {
        return name;
    }
}

