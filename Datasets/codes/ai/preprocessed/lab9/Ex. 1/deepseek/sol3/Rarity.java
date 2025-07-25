public enum Rarity {
    WHITE("Common"),
    PINK("Uncommon"),
    GREEN("Rare"),
    BLUE("Epic"),
    PURPLE("Legendary");

    private final String displayName;

    Rarity(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}