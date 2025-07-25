package lu.uni.programming1.lab9.exercice1;

public class LauncherEx1 {

    public static void main(String[] args) {
        

        item g1 = new gear("Helmet", 150, rarity.Pink, 1, 8, 7);
        item g2 = new gear("Moldy Chestplate", 20, rarity.White, 1, 3, 5);
        item g3 = new gear("Hellish Boots", 1650, rarity.Purple, 18, 30, 50);
        item g4 = new gear("Iron Kneeguards", 400, rarity.Blue, 10, 15, 8);

        item c1 = new consumable("Health Potion", 50, rarity.Green, 5);
        item c2 = new consumable("Stamina Potion", 50, rarity.Green, 3);
        item c3 = new consumable("Strength Potion", 50, rarity.Blue, 2);

        item t1 = new trash("Doll", 2, rarity.White);
        item t2 = new trash("Holy Goblet", 380, rarity.Blue);
        item t3 = new trash("Manuscript", 15, rarity.Green);
        item t4 = new trash("Golden Ring", 800, rarity.Purple);

        inventory inventory = new inventory(10);

        inventory.printInventory();

        inventory.add(g1);
        inventory.add(g2);
        inventory.add(g3);
        inventory.add(g4);
        inventory.add(c1);
        inventory.add(c2);
        inventory.add(t1);
        inventory.add(t1);

        inventory.drop(3);
        inventory.sell(3);
        inventory.use(0);
        inventory.use(5);
        inventory.use(5);
        inventory.use(5);

        inventory.printInventory();

        inventory.drop(t1);

        inventory.printInventory();

        g2.compareTo(t1);
        inventory.add(t2);
        inventory.add(t3);
        inventory.add(t4);
        inventory.add(c3);
        inventory.add(t2);
        inventory.add(t3);
        inventory.add(t4);
        inventory.add(c3);

        inventory.sell(0);
        inventory.sell(8);

        inventory.printInventory();



        



    }
    
}
