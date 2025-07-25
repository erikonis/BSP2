package lu.uni.programming1.lab9.exercise1;

public class Launch {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item gear1 = new Gear("Helmet", 100, Rarity.Blue, 0, 0, 0);
        Item consumable = new Consumable(2, "elixir of life",1000, Rarity.Purple);
        Item consumable2 = new Consumable(2, "elixir of life",1000, Rarity.Purple);

        inventory.add(new Item("garbage", 0, Rarity.Blue));
        inventory.add(gear1);
        inventory.add(consumable);
        inventory.add(consumable2);
        inventory.use(3);
        inventory.sell(2);
        

        System.out.println(inventory.toString());
    }
}
