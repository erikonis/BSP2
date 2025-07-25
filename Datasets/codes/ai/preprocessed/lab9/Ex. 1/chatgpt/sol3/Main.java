public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory(10);

        inv.add(ItemFactory.createGear("Armor", 300, Rarity.PURPLE, 5, 5, 5));
        inv.add(ItemFactory.createTrash("Rusty Nail", 1, Rarity.WHITE));
        inv.add(ItemFactory.createConsumable("Hi-Potion", 100, Rarity.GREEN, 2));

        inv.print();

        inv.use(2);
        inv.use(2);
        inv.use(2); // now gone

        inv.sell(1);
        inv.sell(0); // can't sell gear

        inv.sort(ItemComparators.byValue(true));
        inv.print();
    }
}