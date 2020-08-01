package _Challenges.TimBuchalka.VadiaChallenges.PolymorphismChallenge;

 class Car
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name)
    {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders()
    {
        return cylinders;
    }

      public String getName()
    {
        return name;
    }

          public String startEngine()
          {
              return " Car- startEngine() ";

          }

          public String accelerate()
          {
            return " Car - Accelerate() ";
          }

          public String brake()
          {
              return " Car -  brake() ";

          }

}
  class Honda extends Car
 {

     public Honda(int cylinders, String name)
     {
         super(cylinders,name);
     }

     @Override
     public int getCylinders()
     {
         return super.getCylinders();
     }

     @Override
     public String getName()
     {
         return super.getName();
     }

     @Override
     public String startEngine()
     {
         return " Honda - startEngine() ";
     }

     @Override
     public String accelerate()
     {
         return "Honda- Accelerate() ";
     }

     @Override
     public String brake()
     {
         return " Honda -  brake() ";
     }
 }

 public class PolymorphismChallenge
 {
     public static void main(String[] args)
     {
         Car car=new Car(9,"Base Class ali car");
         System.out.println("Cylinders in the car are  " + car.getCylinders());
         System.out.println(  car.accelerate());
         System.out.println(car.startEngine());
         System.out.println(car.brake());


         Honda hondaCar=new Honda(9,"Honda class ali car");
         System.out.println(hondaCar.accelerate());
         System.out.println(   hondaCar.brake());
         System.out.println(  hondaCar.startEngine());
     }


//     Ford fordCar =new Ford(11,"Endevour");
//     fordCar.
 }
