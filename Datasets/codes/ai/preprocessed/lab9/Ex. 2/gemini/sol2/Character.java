public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        // ... (same as before)
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

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.max(0, Math.min(currentHealth, maxHealth));
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public void takeDamage(int damage) {
        // ... (same as before)
        if (damage < 0) {
            throw new IllegalArgumentException("Damage cannot be negative.");
        }
        int previousHealth = this.currentHealth;
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
        if (previousHealth > 0 && this.currentHealth <= 0) {
            EventManager.getInstance().publishEvent(new CharacterKilledEvent(this));
        }
    }

    public void heal(int amount) {
        // ... (same as before)
        if (amount < 0) {
            throw new IllegalArgumentException("Heal amount cannot be negative.");
        }
        this.currentHealth = Math.min(this.currentHealth + amount, this.maxHealth);
    }

    @Override
    public String toString() {
        return name + " (HP: " + currentHealth + "/" + maxHealth + ")";
    }
}