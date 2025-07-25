public class ItemFactory {
    public static Item createTrash(String name, int value, Rarity rarity) {
        return new TrashItem(name, value, rarity);
    }

    public static Item createGear(String name, int value, Rarity rarity, int crit, int det, int direct) {
        return new GearItem(name, value, rarity, crit, det, direct);
    }

    public static Item createConsumable(String name, int value, Rarity rarity, int charges) {
        return new ConsumableItem(name, value, rarity, charges);
    }
}