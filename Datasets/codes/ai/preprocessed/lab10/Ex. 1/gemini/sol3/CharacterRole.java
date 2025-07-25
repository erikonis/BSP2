public enum CharacterRole {
    DAMAGE, TANK, HEALER;

    public static CharacterRole fromString(String text) {
        for (CharacterRole role : CharacterRole.values()) {
            if (role.name().equalsIgnoreCase(text)) {
                return role;
            }
        }
        throw new IllegalArgumentException("Invalid role name: " + text);
    }
}