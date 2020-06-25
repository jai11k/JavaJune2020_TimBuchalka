package Encapuslation.Example1;

public class Enchancedplayer
{
    public String name;
    public int newHealth =100;
    public String weapon;

    public Enchancedplayer(String name, int health, String weapon) {
        this.name = name;
        if (health>0 && health<=100)
        {
            this.newHealth = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.newHealth = this.newHealth -damage;
        if (this.newHealth <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.newHealth;
    }

    public int getHealth() {
        return newHealth;
    }
}