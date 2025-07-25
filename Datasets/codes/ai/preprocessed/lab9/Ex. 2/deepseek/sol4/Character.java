import java.util.function.Function;

public record Character(String name, int health, int maxHealth,
                       List<ActionEffect> activeEffects) {

    public Character {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Invalid name");
        if (maxHealth <= 0) throw new IllegalArgumentException("Max health must be positive");
        health = Math.min(maxHealth, Math.max(0, health));
        activeEffects = List.copyOf(activeEffects);
    }

    public Character withHealth(int newHealth) {
        return new Character(name, newHealth, maxHealth, activeEffects);
    }

    public Character applyEffect(ActionEffect effect) {
        List<ActionEffect> newEffects = new ArrayList<>(activeEffects);
        newEffects.add(effect);
        return new Character(name, health, maxHealth, newEffects);
    }

    public boolean isAlive() {
        return health > 0;
    }
}