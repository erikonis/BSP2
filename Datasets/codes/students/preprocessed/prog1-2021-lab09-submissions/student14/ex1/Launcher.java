public class Launcher {
    public static void main(String[] args) {
        // define a few items
        Items item1 = new Gear("HelmetA", 14, 1, Rarity.Blue, 1, 1, 1);
        Items item2 = new Trash("Garbage", 2, 1, Rarity.White);
        Items item3 = new Consumable("Energy Stone", 10, 2, Rarity.Pink);
        Inventory inventory1 = new Inventory(10);

        // add to inventory
        System.out.println("****************************************-Added-**************************************");
        inventory1.add(item1);
        inventory1.add(item2);
        inventory1.add(item3);
        System.out.println("************************************************************************************");

        // show inventory
        System.out.println(inventory1.toString());
        // use or sell items from the inventory
        inventory1.use(item3);
        inventory1.sell(item3);
        // show inventory
        System.out.println(
                "################################################-Your inventory now-################################################");
        System.out.println(inventory1.toString());
        System.out.println(
                "####################################################################################################################");

    }
}
