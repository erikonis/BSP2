public class ItemTrash extends Item implements Sellable{

    public ItemTrash(String name, int value, Rarity rarity) {
        super(name, value, rarity);
    }

    @Override
    public String toString() {
        return "["+ rarity +"]" + name + "(" + value + " Gold) ";
    }

}
