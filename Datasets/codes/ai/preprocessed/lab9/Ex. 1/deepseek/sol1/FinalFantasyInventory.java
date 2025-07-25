public class FinalFantasyInventory {
    public static void main(String[] args) {
        // Create inventory with capacity 5
        Inventory inventory = new Inventory(5);

        // Create some items
        TrashItem brokenSword = new TrashItem("Broken Sword", 10, Rarity.WHITE);
        GearItem helmet = new GearItem("Iron Helmet", 150, Rarity.GREEN, 5, 4, 2);
        ConsumableItem potion = new ConsumableItem("Health Potion", 50, Rarity.PINK, 3);
        ConsumableItem ether = new ConsumableItem("Ether", 75, Rarity.BLUE, 2);
        GearItem sword = new GearItem("Steel Sword", 300, Rarity.BLUE, 8, 5, 3);
        TrashItem oldBoot = new TrashItem("Old Boot", 5, Rarity.WHITE);

        // Test adding items
        inventory.add(brokenSword);
        inventory.add(helmet);
        inventory.add(potion);
        inventory.add(ether);
        inventory.add(sword);
        inventory.add(oldBoot); // Should fail (inventory full)

        System.out.println(inventory);

        // Test dropping items
        inventory.drop(2); // Drop ether
        inventory.add(oldBoot); // Now should work

        // Test using items
        inventory.use(1); // Use helmet (gear)
        inventory.use(2); // Use potion (consumable)
        inventory.use(2); // Use potion again
        inventory.use(2); // Use potion again (last charge)
        // Potion should be automatically removed now

        System.out.println(inventory);

        // Test selling items
        inventory.sell(0); // Sell broken sword (sellable)
        inventory.sell(1); // Try to sell sword (not sellable)

        // Test dropping all instances
        TrashItem anotherBoot = new TrashItem("Old Boot", 5, Rarity.WHITE);
        inventory.add(anotherBoot);
        inventory.drop(oldBoot); // Should remove both boots

        System.out.println(inventory);

        // Test sorting
        inventory.add(new TrashItem("Apple", 5, Rarity.WHITE));
        inventory.add(new GearItem("Diamond Ring", 1000, Rarity.PURPLE, 10, 10, 10));

        System.out.println("Before sorting:");
        System.out.println(inventory);

        inventory.sortByName(true);
        System.out.println(inventory);

        inventory.sortByValue(false);
        System.out.println(inventory);
    }
}