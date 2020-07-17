package StaticKeyword.TimBhucalka;

public class LearningStaticKeyword
{
    public static int multiplier=7;
    public static void main(String[] args)
    {

          int answer =multiply(6);
        System.out.println("Answer is : " +answer);
        System.out.println("Muultiplier = "  +multiplier);

    }


    public static int multiply(int number)
    {
        return number*multiplier;
    }
}
