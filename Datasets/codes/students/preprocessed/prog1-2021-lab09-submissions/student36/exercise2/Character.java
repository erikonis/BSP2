public class Character {
    
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth, int currentHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    @Override
    public String toString() {
        return this.name + " ("+ this.currentHealth + "/"+ this.maxHealth+ ")";
    }

}
