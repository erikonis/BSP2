package exercise2;

public class Character {
    
    private String name;
    private int maxHealth, currentHealth;

    public Character(String name, int maxHealth, int currentHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    
    public String toString(){
        return "The player "+name;
    }

    public boolean isPlayerDead(){
        return currentHealth==0;
    }

    public void revivePlayer(){
        currentHealth=maxHealth;
    }
}
