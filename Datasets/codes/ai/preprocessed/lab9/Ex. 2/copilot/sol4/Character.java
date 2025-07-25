public class Character {
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void modifyHealth(int amount) {
        this.currentHealth += amount;
        if (this.currentHealth > maxHealth) {
            this.currentHealth = maxHealth;
        } else if (this.currentHealth <= 0) {
            this.currentHealth = 0;
            Logger.getInstance().logEvent(name + " has died.");
        }
    }
}