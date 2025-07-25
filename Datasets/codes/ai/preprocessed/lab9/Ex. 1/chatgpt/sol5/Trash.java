public class Trash extends Item implements Sellable {
    public Trash(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println("Nothing happens. It's just trash.");
    }
}