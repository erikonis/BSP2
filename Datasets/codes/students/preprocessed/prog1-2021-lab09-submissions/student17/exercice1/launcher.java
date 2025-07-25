import lu.uni.programming1.lab9.exercice1.Item.Rarity;

public class launcher {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(6);
        Gear gear = new Gear("Helmet", 150, 5, 3, 4, Rarity.PURPLE);
        Consumable consumable = new Consumable("Mana Potion", 50, 2, Rarity.WHITE);
        Trash trash = new Trash("Garbage", 1, Rarity.WHITE);


        inventory.add(trash);
        inventory.add(trash);
        inventory.add(consumable);
        inventory.add(gear);
        inventory.add(consumable);
        System.out.println();
        System.out.println(inventory);

        inventory.drop(trash);
        inventory.drop(0);
        inventory.sell(0);
        inventory.sell(1);
        gear.use();
        consumable.use();
        consumable.use();
        consumable.use();



    }
}
