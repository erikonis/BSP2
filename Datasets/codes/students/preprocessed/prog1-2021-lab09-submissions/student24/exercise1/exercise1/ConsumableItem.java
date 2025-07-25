//child class of parent class Item
public class ConsumableItem extends Item {
    int charges;//instance variable


    //constructor
    public ConsumableItem(String name, double value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    //overriding use function to define custom use
    @Override
    public void use() {
        charges--;
        System.out.println("Used the Consumable Item " + name + ". (" + charges + " charges left)");
    }

    //overriding showStats () function for displaying stats

    @Override
    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - " + charges + " charges";
    }
}
