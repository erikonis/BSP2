public class Character {
    private final String name;
    private final int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        if (maxHealth <= 0) throw new IllegalArgumentException("Max health must be positive.");
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
        currentHealth += amount;
        if (currentHealth > maxHealth) currentHealth = maxHealth;
        if (currentHealth <= 0) {
            Logger.getInstance().logDeath(this, amount < 0 ? "killed" : "suicided");
            currentHealth = 0;
        }
    }

    @Override
    public String toString() {
        return name + " [HP: " + currentHealth + "/" + maxHealth + "]";
    }
}