package lu.uni.programming1.lab9.exercise1;

public class Consumable extends Items{
    private int chargers;

    public Consumable(String name_, int value_, rarity rarity_, int chargers_) {
        super(name_, value_, rarity_);
        this.chargers = chargers_;
    }

    public int getChargers() {
        return chargers;
    }

    public void setChargers(int chargers) {
        this.chargers = chargers;
    }

    
    
    
}
