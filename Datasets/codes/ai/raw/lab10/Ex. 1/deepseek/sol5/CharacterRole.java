public enum CharacterRole {
    DAMAGE,
    TANK,
    HEALER;

    public static CharacterRole fromString(String input) throws IllegalArgumentException {
        try {
            return CharacterRole.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid role. Must be DAMAGE, TANK, or HEALER");
        }
    }
}