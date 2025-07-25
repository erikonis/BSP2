@FunctionalInterface
public interface ActionEffect extends Function<Character, Character> {
    default String description() {
        return getClass().getSimpleName();
    }

    static ActionEffect damage(int amount) {
        return character -> character.withHealth(character.health() - Math.abs(amount));
    }

    static ActionEffect heal(int amount) {
        return character -> character.withHealth(character.health() + Math.abs(amount));
    }

    static ActionEffect composite(ActionEffect... effects) {
        return character -> {
            Character result = character;
            for (ActionEffect effect : effects) {
                result = effect.apply(result);
            }
            return result;
        };
    }
}