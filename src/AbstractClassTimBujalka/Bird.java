package AbstractClassTimBujalka;

 abstract  public class Bird extends Animal{
    public Bird(String name) {
        super(name);

    }

    @Override
    public void eat()
    {
        System.out.println( getName() + " is eating...");
    }

    @Override
    public void breathe() {
        System.out.println(getName() +" is breathing in and breathinng out....");

    }
    abstract public void fly();

}
