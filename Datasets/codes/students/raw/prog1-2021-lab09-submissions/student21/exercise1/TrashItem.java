package lu.uni.programming1.lab9.exercise1;

public class TrashItem extends Item implements Sellable {

    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    // From super
    @Override
    public void use() {
        System.out.printf("The trash item %s cannot be used.\n", this.getName());

    }

    // From sellable
    @Override
    public int getValue() {
        return super.getValue();
    }
}
