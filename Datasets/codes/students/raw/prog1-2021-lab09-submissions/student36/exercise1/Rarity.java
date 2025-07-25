package lu.uni.programming1.lab9.exercise1;

public enum Rarity {
    
    WHITE ("WHITE"),
    PINK ("PINK"),
    GREEN ("GREEN"),
    BLUE ("BLUE"),
    PURPLE ("PURPLE");

    private String rarity;

    private Rarity(String rarity) {
        this.rarity = rarity;
    }

    public String getRarity() {
        return rarity;
    }
    
}
