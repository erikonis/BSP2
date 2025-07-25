package lu.uni.programming1.lab9.exercise1;

public class Main {
    
    public static void main(String[] args) {
        
        //GearItem g1= new GearItem("Sword", 100, Rarity.WHITE, 10, 10, 10);
        //GearItem g2= new GearItem("Shield", 150, Rarity.GREEN, 20, 20, 20);

        GearItem g3= new GearItem("Helmet", 250, Rarity.BLUE, 5, 3, 4);

        //TrashItem t1 = new TrashItem("Garbage", 1, Rarity.WHITE);

        ConsumableItem c1 = new ConsumableItem("Health Potion", 120, Rarity.WHITE, 2);
        ConsumableItem c2 = new ConsumableItem("Mana", 120, Rarity.WHITE, 1);

        //System.out.println(g1.compareTo(g2));
        //System.out.println(g2.compareTo(t1));

        Inventory inventory= new Inventory(10);
        
        inventory.add(g3);
        inventory.add(g3);

        System.out.println(inventory);

        inventory.drop(g3);

        inventory.add(c1);
        inventory.add(c2);

        System.out.println(inventory);

        inventory.reverseSort();

        System.out.println(inventory);
    }
}
