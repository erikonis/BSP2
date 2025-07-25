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

        inventory.execute(new AddItemOperation(helmet));
        inventory.execute(new AddItemOperation(potion));
        inventory.execute(new AddItemOperation(rock));
        inventory.execute(new AddItemOperation(ether));
        inventory.execute(new AddItemOperation(sword));
        inventory.execute(new AddItemOperation(feather)); // Inventory full

        System.out.println("\n--- Initial Inventory ---");
        System.out.println(inventory);

        inventory.execute(new UseItemOperation(1)); // Use potion
        inventory.execute(new UseItemOperation(1)); // Use potion again
        inventory.execute(new UseItemOperation(1)); // Use potion again
        inventory.execute(new UseItemOperation(1)); // Try to use potion with no charges

        System.out.println("\n--- Inventory after using potion ---");
        System.out.println(inventory);

        inventory.execute(new DropItemOperationByName(rock));
        inventory.execute(new DropItemOperationByName(new TrashItem("Chocobo Feather", 2, Rarity.PINK))); // Try to drop by item

        System.out.println("\n--- Inventory after dropping items ---");
        System.out.println(inventory);

        inventory.execute(new SellItemOperation(0)); // Sell helmet (not sellable)
        inventory.execute(new SellItemOperation(1)); // Sell ether
        inventory.execute(new SellItemOperation(0)); // Sell potion (no charges left, should be at index 0 now)

        System.out.println("\n--- Inventory after selling items ---");
        System.out.println(inventory);

        inventory.sort("name", "ascending");
        System.out.println("\n--- Inventory sorted by name (ascending) ---");
        System.out.println(inventory);

        inventory.execute(new AddItemOperation(rock));
        inventory.execute(new AddItemOperation(feather));

        inventory.sort("value", "descending");
        System.out.println("\n--- Inventory sorted by value (descending) ---");
        System.out.println(inventory);

        inventory.sort("rarity", "ascending"); // Invalid sort criteria
        inventory.sort("name", "random");    // Invalid sort order

        System.out.println("\n--- Final Inventory ---");
        System.out.println(inventory);
    }
}