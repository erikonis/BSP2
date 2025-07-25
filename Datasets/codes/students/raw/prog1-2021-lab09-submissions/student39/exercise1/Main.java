package lu.uni.programming1.lab9.exercise1;

import lu.uni.programming1.lab9.exercise1.Item.Rarity;

public class Main {
    public static void main(String[] args) {
        
        GearItem gi1 = new GearItem("Bronze Sword", 50, 2, 1, 2, Rarity.PINK);
        GearItem gi2 = new GearItem("Bronze Helmet", 50, 0, 3, 3, Rarity.PINK);
        GearItem gi3 = new GearItem("Weathered Sword", 75, 4, 2, 1, Rarity.GREEN);
        GearItem gi4 = new GearItem("Wooden Sword", 5, 0, 1, 1, Rarity.WHITE);
        GearItem gi5 = new GearItem("Wooden Sword", 5, 0, 1, 1, Rarity.WHITE);
        GearItem gi6 = new GearItem("Wooden Sword", 5, 0, 1, 1, Rarity.WHITE);
        ConsItem cs1 = new ConsItem("Stamina potion", 10, Rarity.WHITE, 2);
        ConsItem cs2 = new ConsItem("Health potion", 15,Rarity.WHITE,2);
        ConsItem cs3 = new ConsItem("Max Health potion", 100,Rarity.PURPLE,4);
        TrashItem tr1 = new TrashItem("Scrap", 2, Rarity.WHITE);
        TrashItem tr2 = new TrashItem("Dust", 5, Rarity.WHITE);
        TrashItem tr3 = new TrashItem("Dust", 5, Rarity.WHITE);
        TrashItem tr4 = new TrashItem("Dust", 5, Rarity.WHITE);
    

        Inventory inv = new Inventory(12);
        inv.add(gi1);
        inv.add(gi2);
        inv.add(gi3);
        inv.add(gi4);
        inv.add(gi5);
        inv.add(gi6);
        inv.add(cs1);
        inv.add(cs2);
        inv.add(cs3);
        inv.add(tr1);
        inv.add(tr2);
        inv.add(tr3);
        inv.add(tr4);

        inv.toString();

        inv.drop(gi4);

        inv.drop(3);
        
        inv.use(0);
        inv.use(3);
        inv.use(3);
        inv.use(3);

        inv.sell(0);
        inv.sell(3);
        inv.sell(4);
        inv.sell(5);

        

        inv.toString();
        
    }
}
