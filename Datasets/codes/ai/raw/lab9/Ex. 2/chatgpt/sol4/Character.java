public class Character {
    private final String name;
    private final int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        if (maxHealth <= 0) throw new IllegalArgumentException("Max health must be positive");
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public String getName() { return name; }
    public int getMaxHealth() { return maxHealth; }
    public int getCurrentHealth() { return currentHealth; }

    public void modifyHealth(int delta) {
        currentHealth += delta;
        if (currentHealth > maxHealth) currentHealth = maxHealth;
        if (currentHealth < 0) currentHealth = 0;
    }

    public boolean isDead() {
        return currentHealth <= 0;
    }

    @Override
    public String toString() {
        return name + " (HP: " + currentHealth + "/" + maxHealth + ")";
    }
}
