public class FinalFantasyInventory {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(5);

        GearItem helmet = new GearItem("Iron Helmet", 50, Rarity.GREEN, 5, 4, 2);
        ConsumableItem potion = new ConsumableItem("Potion", 10, Rarity.WHITE, 3);
        TrashItem rock = new TrashItem("Pebble", 1, Rarity.WHITE);
        ConsumableItem ether = new ConsumableItem("Ether", 25, Rarity.GREEN, 2);
        GearItem sword = new GearItem("Bronze Sword", 100, Rarity.BLUE, 10, 0, 5);
        TrashItem feather = new TrashItem("Chocobo Feather", 2, Rarity.PINK);
        ConsumableItem antidote = new ConsumableItem("Antidote", 15, Rarity.WHITE, 5);

        inventory.add(helmet);
        inventory.add(potion);
        inventory.add(rock);
        inventory.add(ether);
        inventory.add(sword);
        inventory.add(feather); // Inventory full

        System.out.println("\n--- Initial Inventory ---");
        System.out.println(inventory);

        inventory.use(1); // Use potion
        inventory.use(1); // Use potion again
        inventory.use(1); // Use potion again
        inventory.use(1); // Try to use potion with no charges

        System.out.println("\n--- Inventory after using potion ---");
        System.out.println(inventory);

        inventory.drop(rock);
        inventory.drop(new TrashItem("Chocobo Feather", 2, Rarity.PINK)); // Try to drop by item

        System.out.println("\n--- Inventory after dropping items ---");
        System.out.println(inventory);

        inventory.sell(0); // Sell helmet (not sellable)
        inventory.sell(1); // Sell ether
        inventory.sell(0); // Sell potion (no charges left, should be at index 0 now)

        System.out.println("\n--- Inventory after selling items ---");
        System.out.println(inventory);

        inventory.sort("name", "ascending");
        System.out.println("\n--- Inventory sorted by name (ascending) ---");
        System.out.println(inventory);

        inventory.add(rock);
        inventory.add(feather);

        inventory.sort("value", "descending");
        System.out.println("\n--- Inventory sorted by value (descending) ---");
        System.out.println(inventory);

        inventory.sort("rarity", "ascending"); // Invalid sort criteria
        inventory.sort("name", "random");    // Invalid sort order

        System.out.println("\n--- Final Inventory ---");
        System.out.println(inventory);
    }
}