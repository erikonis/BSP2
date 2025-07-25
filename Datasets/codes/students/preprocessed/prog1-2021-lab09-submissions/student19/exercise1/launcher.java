import lu.uni.programming1.lab9.exercise1.Inventory.Inventory;
import lu.uni.programming1.lab9.exercise1.Item.Rarity;
import lu.uni.programming1.lab9.exercise1.Item.Types.Consumable;
import lu.uni.programming1.lab9.exercise1.Item.Types.Gear;
import lu.uni.programming1.lab9.exercise1.Item.Types.GearBuff;

public class launcher {
    public static void main(String[] args) {
        Inventory i = new Inventory();
    
        
        Consumable i0 = new Consumable("Potion of nothingness", 10, Rarity.PURPLE, "Does nothing", 2);
        Gear i1 = new Gear("Sword of the Void", Integer.MAX_VALUE, Rarity.PURPLE, new GearBuff(999, -1, 999));

        i.add(i0); i.add(i1);

        System.out.println(i.toString());
        System.out.println("----");
        i.drop(i0);
        System.out.println(i.toString());
        i.add(i0);

        System.out.println("----");
        System.out.println(i.use(0));
    }


}
