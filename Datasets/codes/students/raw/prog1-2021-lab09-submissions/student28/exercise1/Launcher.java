package lu.uni.programming1.lab9.exercise1;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Sample 1 \n");
        //first sample
        Inventory inv1 = new Inventory(2);
        inv1.add(new ConsumableItems("Mana Potion", 35, Rarity.WHITE, 2));
        inv1.add(new GearItems("Better Helmet", 250.0, Rarity.PURPLE, 10,6,8));
        
        
        System.out.println("\n" + inv1.toString());
        
        System.out.println("Sample 2 \n");
        //second sample
        //adding everything needed to inventory
        Inventory inv2 = new Inventory(6);
        GearItems g = new GearItems("Helmet", 150, Rarity.BLUE, 5, 3, 4);
        inv2.add(g);
        inv2.add(g);
        inv2.add(new ConsumableItems("Health Potion", 50, Rarity.WHITE, 2));
        inv2.add(new ConsumableItems("Mana Potion", 35, Rarity.WHITE, 1));
        inv2.add(new GearItems("Better Helmet", 250.0, Rarity.PURPLE, 10,6,8));
        inv2.add(new TrashItems("Garbage", 1, Rarity.WHITE));

        System.out.println();
        
        inv2.remove(g);

        System.out.println();

        inv2.add(g);

        System.out.println();

        
        int index = inv2.search("Health Potion");
        //I convert the "Item" to ConsumableItems because if search found Health Potion it is one
        ConsumableItems c = (ConsumableItems)inv2.getItem(index);
        c.use();
        c.use();
        c.use();

        System.out.println();
        
        inv2.use(inv2.search("Helmet"));

        System.out.println();

        inv2.use(inv2.search("Mana Potion"));

        System.out.println();

        inv2.sell(inv2.search("Better Helmet"));
        inv2.sell(inv2.search("Health Potion"));
        inv2.sell(inv2.search("Garbage"));
        }
}
