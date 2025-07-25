public class character {

    private String name;
    private int currentHealth;

    public character(String name, int currentHealth) {
        this.name = name;
        this.currentHealth = currentHealth;
    }

    public boolean takeDamage(int damage) {
        if (currentHealth - damage <= 0) {
            currentHealth = 0;
            return true; // The guy is dead!!
        } else {
            currentHealth = currentHealth - damage;
            return false; // The guy is alive!
        }
    }

    public String toString() {
        return name;
    }

    public boolean stillAlive() {
        return currentHealth != 0;
    }
}