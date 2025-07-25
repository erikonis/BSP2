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

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = Math.min(currentHealth, maxHealth);
        this.currentHealth = Math.max(currentHealth, 0);
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            this.currentHealth -= damage;
            if (this.currentHealth < 0) {
                this.currentHealth = 0;
            }
            Logger.getInstance().logEvent(this.getName() + " takes " + damage + " damage.");
        }
    }

    public void heal(int amount) {
        if (amount > 0) {
            this.currentHealth += amount;
            if (this.currentHealth > this.maxHealth) {
                this.currentHealth = this.maxHealth;
            }
            Logger.getInstance().logEvent(this.getName() + " heals " + amount + " HP.");
        }
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", maxHealth=" + maxHealth +
                ", currentHealth=" + currentHealth +
                '}';
    }
}