package _Basic.MethodOverLoading;

public class LearningMethodOverLoading
{

    public static void main (String[] args)
    {
        //method ovriding will be covered in inheritance
//method overloading means ... function name should be same but parameters should be different
        int totalScore = calculateScore("Karan" ,500);
        System.out.println("New Score is =>" +totalScore);

        totalScore = calculateScore(600);
        System.out.println("New Score is =>" +totalScore);

        totalScore = calculateScore();
        System.out.println("New Score is => " +totalScore);

    }



    public static int calculateScore(String playerName ,int score)
    {
        System.out.println("Player " + playerName + " scored" + score + "points");
        return score *= 1000;
    }
    public static int calculateScore (int score)
    {
        System.out.println("Unnamed player scored" + score + "points");
        return score *= 1000;
    }
    public static int calculateScore () {
        System.out.println("No player Name and No score ");
        return 0;
    }
}
