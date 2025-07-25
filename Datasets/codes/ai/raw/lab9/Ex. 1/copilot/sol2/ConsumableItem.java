import java.util.Objects;

public class ConsumableItem extends AbstractItem {
    private int charges;

    public ConsumableItem(String name, int value, Rarity rarity, int charges) {
        super(name, value, rarity);
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    @Override
    public void use() {
        if (charges > 0) {
            charges--;
            System.out.println("Used " + getName() + ". Remaining charges: " + charges);
        } else {
            System.out.println(getName() + " has no charges left.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ConsumableItem{" +
                "charges=" + charges +
                '}';
    }
}
