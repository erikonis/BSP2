public class TrashItem extends Item implements Sellable {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println("You used " + name + " but nothing happened. It's trash after all.");
    }

    @Override
    public String toString() {
        return "[Trash] " + super.toString();
    }
}