package _OOPS.Polymorphisim;


public class Polymorphisim
{

    public Polymorphisim()
    {
        for (int i =1;i<=11;i++)
        {
            Movie movie=randomMovie();
            System.out.println("Movie # "+i + ":" +movie.getName() + "\n"+
                    "Plot : "+movie.plot() + "\n");
        }
    }
    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("Random number = " +randomNumber);
        switch (randomNumber)
        {
            case 1:
                return new ChakDeFatte();

            case 2:
                return  new Independenceday() ;

            case 3 :
                return new MazeRunner() ;

            case 4 :
                return new Carwars() ;

             case 5:
                 return new Forgetable() ;

            default:
                throw new IllegalStateException("Unexpected value: " + randomNumber);
        }



    }

}

 class Movie
{
    public String name;

    public Movie(String name)
    {
        this.name = name;
    }
    public String plot()
    {
        return "No plot is here";
    }

    public String getName() {
        return name;
    }
}

class ChakDeFatte extends Movie
{
    public ChakDeFatte()
    {

        super("ChakDeFatte");
    }

    @Override
    public String plot() {
        return "ik hasse vali film ";
    }
}

class Independenceday extends Movie
{
    public Independenceday() {
        super("Independenceday");
    }

    @Override
    public String plot() {
        return "Aliens attempt to attack earth";
    }
}

class MazeRunner  extends Movie
{
    public MazeRunner()
    {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape Maze";
    }
}

class Carwars extends Movie
{
    public Carwars()
    {

        super("Carwars");
    }

    @Override
    public String plot() {
        return "imperial power tries to take over the universe";
    }
}

class Forgetable extends Movie
{
    public Forgetable()
    {
        super("Forgetable");
    }
}