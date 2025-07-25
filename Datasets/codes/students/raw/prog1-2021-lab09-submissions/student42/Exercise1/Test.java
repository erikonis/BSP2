package lu.uni.programming1.lab9.Exercise1;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        TrashItem i1 = new TrashItem("Doran's ring", 400, Rarity.BLUE);
        GearItem i2 = new GearItem("BF Sword", 1300, Rarity.GREEN, 300, 5, 100);
        GearItem i4 = new GearItem("Riftmaker", 3100, Rarity.PURPLE, 550, 15, 170);
        GearItem i5 = new GearItem("Rabadon's Deathcap", 3600, Rarity.PURPLE, 100, 200, 50);
        GearItem i7 = new GearItem("Immortal Shieldbow",3200,Rarity.PURPLE,110,150,70);
        ConsumableItem i3 = new ConsumableItem("Health potion", 50, Rarity.WHITE, 3);
        ConsumableItem i6 = new ConsumableItem("Elixir of wrath", 500, Rarity.PINK, 1);
        
        Inventory m = new Inventory(8);
        
        m.add(i1);
        m.add(i2);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.add(i5);
        m.add(i6);
        m.add(i7);
        m.add(i1);
        System.out.println(m);

        m.drop(i2);
        m.add(i2);
        m.use(1);
        m.use(1);
        m.use(1);
        m.use(1);
        m.sell(1);
        m.sell(0);
        System.out.println(m);
        

        Comparison byNameA =new Comparison(Comparator.comparing(Item::getName),"name", "ascending");
        Comparison byValueA =new Comparison(Comparator.comparing(Item::getValue),"value", "ascending");
        Comparison byNameD =new Comparison(Comparator.comparing(Item::getName),"name", "descending");
        Comparison byValueD =new Comparison(Comparator.comparing(Item::getValue),"value", "descending");
        m.sort(byNameA);
        System.out.println(m);
        m.sort(byValueA);
        System.out.println(m);
        m.sort(byNameD);
        System.out.println(m);
        m.sort(byValueD);
        System.out.println(m);

    }
    
}
