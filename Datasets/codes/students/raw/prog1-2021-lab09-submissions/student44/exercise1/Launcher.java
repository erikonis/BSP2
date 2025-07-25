package lu.uni.programming1.lab9.exercise1;

public class Launcher {
    public static void main(String[] args) {
    
        Consumable c1 = new Consumable("Mana Potion", 35, Rarity.WHITE, 3);
        Gear g1 = new Gear("Helmet", 350, Rarity.PINK, 2, 5, 6);
        Trash t1 = new Trash("Weed", 1, Rarity.WHITE);
        Inventory inventory = new Inventory();
        inventory.add(c1);
        inventory.add(g1);
        inventory.add(t1);
        c1.use(c1);
        c1.use(c1);
        c1.use(c1);
        c1.use(c1);
        g1.use(g1);
        inventory.use(0);
        inventory.printLlist();
        inventory.sell(0);
        inventory.sell(1);
    }
}
