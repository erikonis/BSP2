public class TrashItem extends Item {

    public TrashItem(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public void use() {
        System.out.println("The trash item " + getName() + " can not be used.");
    }

}
