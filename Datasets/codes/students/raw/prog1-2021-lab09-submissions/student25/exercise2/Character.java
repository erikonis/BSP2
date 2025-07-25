package lu.uni.programming1.lab9.exercise2;

public class Character {
    
    private String name;
    private int maxHealth;
    private int health;

    public Character(String name, int maxHealth, int health) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = health;
        }
    }

}
