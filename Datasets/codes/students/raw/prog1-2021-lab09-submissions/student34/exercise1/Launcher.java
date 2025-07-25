package lu.uni.programming1.lab9.exercise1;

public class Launcher {

    public static void main(String[] args) {
        
    Inventory bag = new Inventory(3);
    Inventory smallbag = new Inventory(1);
    Inventory bigbag = new Inventory(4);

    Gear sword = new Gear("Kusanagi", 10000, Rarity.PURPLE, 50, 70, 90);
    Gear sword2 = new Gear("Kusanagi", 10000, Rarity.PURPLE, 50, 70, 90);
    Consumable ramen = new Consumable("Ichiraku", 5, Rarity.PINK, 1);
    Trash vase = new Trash("Ming", 5000, Rarity.PURPLE);
    Trash coin = new Trash("Atlantis", 7000, Rarity.PURPLE);
    Gear arrow = new Gear("Sky", 100, Rarity.GREEN, 10, 25, 40);

    // Item not added if bag is full.
    smallbag.add(ramen);
    smallbag.add(vase);
    smallbag.print();

    System.out.println("\n");

    // Item removed to make space and if used and no charges.
    // Selling only removes item if it is trash or consumable.
    bigbag.add(vase);
    bigbag.add(ramen);
    bigbag.add(sword);
    bigbag.add(coin);
    bigbag.sell(2);
    bigbag.sell(3);
    bigbag.use(1);
    bigbag.Drop(0);
    bigbag.print();

    System.out.println("\n");

    // Both swords dropped because they have the same name and rarity.
    bag.add(sword);
    bag.add(arrow);
    bag.add(sword2);
    bag.Drop(sword);
    bag.print();

    }
}
