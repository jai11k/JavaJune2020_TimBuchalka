package _Basic;

public class LearningMethods
{

    public static void main(String[] args)
        {
            System.out.println("i am from Learningmethod class");

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition( "KAran", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition( "jai", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition( "sodhi", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition( "Anmol", highScorePosition);
        }

        public static void displayHighScorePosition (String playerName ,int highScorePosition){
            System.out.println(playerName + "Managed to get into  Position" + highScorePosition + "on the high score table");
        }
        public static int calculateHighScorePosition ( int playerScore){
            if (playerScore > 1000) {
                return 1;
            } else if (playerScore > 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore > 100 && playerScore < 50) {
                return 3;
            } else
                return 4;
        }
    }

