package exercise2;

public class Character {
    
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth){
        this.setName(name);
        this.setMaxHealth(maxHealth);
        this.setCurrentHealth(maxHealth);
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Character [name=" + name + ", Maximum Health= " +maxHealth+"Current Health= "+currentHealth+"]";
    }
}
