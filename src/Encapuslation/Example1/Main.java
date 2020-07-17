package Encapuslation.Example1;

public class Main
{
    public static void main(String[] args) {
        Enchancedplayer player1= new Enchancedplayer("kARAN",650,"Sword");

        System.out.println("Remaining health = " +player1.getHealth());

        Player player=new Player();
        player.name ="Karan";
        player.weapon= "Sword";
        player.health= 100;


        int damage= 101;

        player.loseHealth(damage);
        System.out.println( "Remaining health = "+player.healthRemaining());
    }
}
