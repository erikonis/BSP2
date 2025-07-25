public sealed interface Role permits DamageDealer, Tank, Healer {
    String displayName();

    static Role fromString(String input) {
        return switch (input.toUpperCase()) {
            case "DAMAGE" -> new DamageDealer();
            case "TANK" -> new Tank();
            case "HEALER" -> new Healer();
            default -> throw new IllegalArgumentException("Invalid role: " + input);
        };
    }
}

final class DamageDealer implements Role {
    @Override public String displayName() { return "Damage Dealer"; }
}

final class Tank implements Role {
    @Override public String displayName() { return "Tank"; }
}

final class Healer implements Role {
    @Override public String displayName() { return "Healer"; }
}