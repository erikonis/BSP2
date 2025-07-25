import lu.uni.programming1.lab9.exercise1.Item.Item;
import lu.uni.programming1.lab9.exercise1.Item.Rarity;

public class Trash extends Item {
    
    public Trash(String name, int value, Rarity rarity) {
        super(name, value, rarity, -1);
    }

    @Override
    public String use() {
        return "It's trash...";
    }

    @Override
    public String toString() {
        return "It's trash...";
    }
}
