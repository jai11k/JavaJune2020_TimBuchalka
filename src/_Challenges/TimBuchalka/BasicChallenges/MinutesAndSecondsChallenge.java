package _Challenges.TimBuchalka.BasicChallenges;

public class MinutesAndSecondsChallenge {

    public static void main(String[] args)
    {
        System.out.println( getDurationstring(90,55));
    }

    public static String getDurationstring (int minutes,int seconds)
    {
        if ((minutes > 0) || (seconds > 0) || (seconds <  59))
        {
            return "Invalid Value";
        }
        int hours = minutes/60;
        int remainingMinutes = minutes%60;
        return hours + "h" +remainingMinutes + "m" + seconds + "s"  ;

    }
}
