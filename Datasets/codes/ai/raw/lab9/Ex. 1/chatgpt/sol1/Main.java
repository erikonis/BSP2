public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);

        GearItem helmet = new GearItem("Helmet", 120, Rarity.BLUE, 5, 4, 2);
        ConsumableItem potion = new ConsumableItem("Potion", 30, Rarity.GREEN, 3);
        TrashItem bananaPeel = new TrashItem("Banana Peel", 1, Rarity.WHITE);

        inventory.add(helmet);
        inventory.add(potion);
        inventory.add(bananaPeel);
        inventory.add(new TrashItem("Banana Peel", 1, Rarity.WHITE)); // duplicate

        inventory.printInventory();

        inventory.use(1); // use potion
        inventory.use(1); // again
        inventory.use(1); // again
        inventory.use(1); // now it's gone

        inventory.sell(0); // helmet - can't sell
        inventory.sell(1); // trash - can sell

        inventory.printInventory();

        inventory.sortByName(true);
        inventory.printInventory();

        inventory.sortByValue(false);
        inventory.printInventory();
    }
}
