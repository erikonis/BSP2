public class TrashItem extends Item implements Sellable {
    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println(name + " is trash and cannot be used.");
    }
}