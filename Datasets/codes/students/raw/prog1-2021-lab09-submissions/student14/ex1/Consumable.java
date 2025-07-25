
public class Consumable extends Items {

    public Consumable(String name, int value, int charge, Rarity rarity) {
        super(name, value, charge, rarity);
    }

    @Override
    public String toString() {
        return "Consumable []";
    }

}
