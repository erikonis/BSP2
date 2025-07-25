import lu.uni.programming1.lab9.exercise1.Item.Item;
import lu.uni.programming1.lab9.exercise1.Item.Rarity;

public class Gear extends Item {

    private GearBuff buff;

    public Gear(String name, int value, Rarity rarity, GearBuff buff) {
        super(name, value, rarity, -1);

        this.buff = buff;
    }

    public GearBuff getBuff() {return this.buff;}

    @Override
    public String toString() {
        return "GEAR\n" + super.toString() + "\n\tBuff : " + this.buff.toString();
    }
}
