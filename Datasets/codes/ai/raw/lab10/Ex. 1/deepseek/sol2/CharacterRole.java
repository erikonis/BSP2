import java.util.Arrays;

public enum CharacterRole {
    DAMAGE("Damage Dealer"),
    TANK("Tank"),
    HEALER("Healer");
    
    private final String displayName;
    
    CharacterRole(String displayName) {
        this.displayName = displayName;
    }
    
    public static CharacterRole fromInput(String input) {
        return Arrays.stream(values())
            .filter(role -> role.name().equalsIgnoreCase(input))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException(
                "Invalid role. Must be one of: " + Arrays.toString(values()))
            );
    }
    
    @Override
    public String toString() {
        return displayName;
    }
}