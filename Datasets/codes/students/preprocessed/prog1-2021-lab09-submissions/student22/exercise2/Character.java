public class Character {
    String name;
    int maxHealth,health;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
