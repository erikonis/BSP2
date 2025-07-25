public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);

        Item trashItem = new TrashItem("Old Boot", 5, Rarity.WHITE);
        Item gearItem = new GearItem("Helmet", 100, Rarity.BLUE, 5, 4, 2);
        Item consumableItem = new ConsumableItem("Potion", 50, Rarity.GREEN, 3);

        inventory.add(trashItem);
        inventory.add(gearItem);
        inventory.add(consumableItem);

        System.out.println(inventory);

        inventory.use(2);
        inventory.use(2);
        inventory.use(2);
        inventory.use(2);

        inventory.sell(0);
        inventory.drop(1);

        System.out.println(inventory);
    }
}
