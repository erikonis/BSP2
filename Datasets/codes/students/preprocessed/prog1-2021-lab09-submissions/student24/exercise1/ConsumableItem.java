

public class ConsumableItem extends Item {
    int charges;

    public ConsumableItem(String name, double value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    @Override
    public void use() {
        charges--;
        System.out.println("Used the Consumable Item " + name + ". (" + charges + " charges left)");
    }

    @Override
    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - " + charges + " charges";
    }
}
