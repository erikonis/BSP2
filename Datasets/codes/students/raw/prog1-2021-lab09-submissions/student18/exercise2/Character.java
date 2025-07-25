package lab9.exercise2;

public class Character {
    private String name;
    private int maximumHealth;
    private int currentHealth;

    public Character(String name, int maximumHealth, int currentHealth) {
        this.name = name;
        this.maximumHealth = maximumHealth;
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaximumHealth() {
        return maximumHealth;
    }

    public void setMaximumHealth(int maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    
    
}
