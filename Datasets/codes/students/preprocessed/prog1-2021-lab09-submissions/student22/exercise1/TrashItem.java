public class TrashItem extends Item {

    public TrashItem(String name, int value, Colours rarity) {
        super(name, value, rarity);
    }

    public void use() {
        System.out.println("This doesn't do anything.");
    }

    @Override
    public String toString() {
        return String.format("[%s] %s (%d Gold) - Trash",getRarity(),getName(),getValue());
    }

}
