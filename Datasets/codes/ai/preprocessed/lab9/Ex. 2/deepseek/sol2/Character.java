import java.util.ArrayList;
import java.util.List;

public class Character {
    private final String name;
    private int health;
    private final int maxHealth;
    private final List<CharacterEventListener> listeners = new ArrayList<>();

    public Character(String name, int maxHealth) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Character name cannot be empty");
        }
        if (maxHealth <= 0) {
            throw new IllegalArgumentException("Max health must be positive");
        }
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void addListener(CharacterEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(CharacterEventListener listener) {
        listeners.remove(listener);
    }

    public void modifyHealth(int amount) {
        int oldHealth = health;
        health = Math.min(maxHealth, Math.max(0, health + amount));

        if (oldHealth != health) {
            notifyHealthChanged(oldHealth, health);
        }

        if (health == 0) {
            notifyCharacterDied();
        }
    }

    private void notifyHealthChanged(int oldHealth, int newHealth) {
        for (CharacterEventListener listener : listeners) {
            listener.onHealthChanged(this, oldHealth, newHealth);
        }
    }

    private void notifyCharacterDied() {
        for (CharacterEventListener listener : listeners) {
            listener.onCharacterDied(this);
        }
    }

    // Getters
    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMaxHealth() { return maxHealth; }
    public boolean isAlive() { return health > 0; }

    @Override
    public String toString() {
        return String.format("%s (HP: %d/%d)", name, health, maxHealth);
    }
}