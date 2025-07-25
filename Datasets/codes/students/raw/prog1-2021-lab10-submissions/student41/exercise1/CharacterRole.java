package lu.uni.programming1.lab10.exercise1;

public enum CharacterRole {
    DAMAGE, HEALER, TANK;

    public static CharacterRole stringToRole(String s) throws UnknownChar {
        switch (s) {
            case "HEALER", "TANK", "DAMAGE":
                return valueOf(s);
            default:
                throw new UnknownChar(s);
        }
    }
}
