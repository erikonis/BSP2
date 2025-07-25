public class TrashItem extends Item implements Sellable {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public String toString() {
        return "[Trash] " + super.toString();
    }
}