public class Launcher {
    public static void main(String[] args) {

    Inventory Inv = new Inventory(10); 
    Items Gear1 = new GearItems("Helmet", 100, Rarity.GREEN, 5, 4, 2);
    Items Gear2 = new GearItems("Chestplate", 475, Rarity.PURPLE, 22, 15, 10);
    Items Gear3 = new GearItems("Leggings", 350, Rarity.PINK, 15, 8, 12);
    Items Gear4 = new GearItems("Boots", 225, Rarity.BLUE, 8, 5, 4);
    Items Consu1 = new ConsumableItems("Mana", 35, Rarity.WHITE, 3);
    Items Trash1 = new TrashItems("Chicken Nugget", 10, Rarity.WHITE);

    Inv.add(Gear1);
    Inv.add(Gear2);
    Inv.add(Gear3);
    Inv.add(Gear4);
    Inv.add(Consu1);
    Inv.add(Trash1);

    System.out.println(Inv);

    System.out.println("\n");
    Inv.drop(Gear1);
    Inv.use(4);
    Inv.use(3);
    
    
    }  
}
