package lu.uni.programming1.lab9.exercise1;

public class Launcher {
    static item itm1 = new item("Better helmet", Rarity.PURPLE, Types.GEAR, 6, 4, 5, 150, 2);
    static item itm2 = new item("Mana potion", Rarity.WHITE, Types.CONSUMABLE, 1, 2, 3, 24, 1);

    public static void main(String[] args) {
        Inventory.add(itm1);
        Inventory.add(itm2);
        int inventory = itm1.getQuantity() + itm2.getQuantity();
        System.out.print("Inventory : (" + inventory + ")\n");
        item.display(itm1);
        item.display(itm2);
    }
}