import java.util.Objects;

public class Character {
    private final String name;
    private final int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        this.name = Objects.requireNonNull(name, "Character name cannot be null");
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;

        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Max health must be positive");
        }
    }

    public void takeDamage(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Damage amount cannot be negative");
        }
        currentHealth = Math.max(0, currentHealth - amount);
        if (currentHealth == 0) {
            GameLogger.getInstance().logDeath(this, null);
        }
    }

    public void heal(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Heal amount cannot be negative");
        }
        currentHealth = Math.min(maxHealth, currentHealth + amount);
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    // Getters
    public String getName() { return name; }
    public int getMaxHealth() { return maxHealth; }
    public int getCurrentHealth() { return currentHealth; }

    @Override
    public String toString() {
        return name + " (HP: " + currentHealth + "/" + maxHealth + ")";
    }
}