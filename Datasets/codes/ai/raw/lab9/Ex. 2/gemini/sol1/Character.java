public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Maximum health must be positive.");
        }
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

    // Returns a new Character with updated health (immutable approach)
    public Character withHealthChanged(int delta) {
        int newHealth = Math.max(0, Math.min(this.currentHealth + delta, this.maxHealth));
        return new Character(this.name, this.maxHealth, newHealth);
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    @Override
    public String toString() {
        return name + " (HP: " + currentHealth + "/" + maxHealth + ")";
    }
}