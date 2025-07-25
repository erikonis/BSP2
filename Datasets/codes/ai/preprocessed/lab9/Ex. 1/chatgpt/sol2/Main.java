public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory(8);

        inv.add(new GearItem("Helmet", 200, Rarity.BLUE, 5, 4, 2));
        inv.add(new TrashItem("Banana Peel", 1, Rarity.WHITE));
        inv.add(new ConsumableItem("Potion", 50, Rarity.GREEN, 2));
        inv.add(new TrashItem("Banana Peel", 1, Rarity.WHITE));

        inv.printInventory();

        inv.use(2); // potion use
        inv.use(2); // potion again
        inv.use(2); // potion gone

        inv.sell(1); // sell trash
        inv.sell(0); // try to sell gear

        inv.sortByValue(true);
        inv.printInventory();
    }
}