public class Character {
    String name;
    int maximumHealth = 100;
    int currentHealth = maximumHealth;

    public Character(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
        
    }

    public String getName() {
        return name;
    }
}
