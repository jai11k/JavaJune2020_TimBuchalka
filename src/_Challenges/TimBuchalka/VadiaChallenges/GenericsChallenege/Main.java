package _Challenges.TimBuchalka.VadiaChallenges.GenericsChallenege;

public class Main
{
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayyer pat = new BaseBallPlayyer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
