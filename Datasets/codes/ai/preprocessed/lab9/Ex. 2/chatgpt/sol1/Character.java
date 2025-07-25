public class Character {
    private final String name;
    private final int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void changeHealth(int amount) {
        currentHealth = Math.max(0, Math.min(maxHealth, currentHealth + amount));
    }

    public boolean isDead() {
        return currentHealth <= 0;
    }

    @Override
    public String toString() {
        return name + " (" + currentHealth + "/" + maxHealth + ")";
    }
}