package lu.uni.programming1.lab9.exercice1;

public enum rarity {
    
    White(0),
    Pink(1),
    Green(2),
    Blue(3),
    Purple(4);

    private int rarityValue;

    rarity(int rarityValue)
    {
        this.rarityValue = rarityValue;
    }

}
