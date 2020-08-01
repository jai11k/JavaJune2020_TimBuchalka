package _Challenges.TimBuchalka.VadiaChallenges.PolymorphismChallenge;

class Ford extends Car
{

   public Ford(int cylinders, String name)
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
       return " FORD - startEngine() ";
   }

   @Override
   public String accelerate()
   {
       return "FORd - Accelerate() ";
   }

   @Override
   public String brake()
   {
       return " FORD -  brake() ";
   }
}

