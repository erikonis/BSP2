public class TrashItem extends AbstractItem {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println("Trash item " + getName() + " cannot be used.");
    }
}