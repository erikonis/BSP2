import lu.uni.programming1.lab9.exercise1.Item.Item;
import lu.uni.programming1.lab9.exercise1.Item.Rarity;

public class Consumable extends Item {

    private String effect;
    
    public Consumable(String name, int value, Rarity rarity, String effect, int charges) {
        super(name, value, rarity, charges);
        this.effect = effect;
    }

    public String getEffect() {return this.effect;}

    @Override
    public String use() {
        super.charges -= 1;
        return super.use() + "\n Applied " + this.effect + " effect.";
    }

    @Override
    public String toString() {
        return "CONSUMABLE\n" + super.toString();
    }
}
