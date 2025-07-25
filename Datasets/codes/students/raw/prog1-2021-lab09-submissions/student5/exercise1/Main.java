package lu.uni.programming1.lab9.exercise1;

public class Main {
    static item item1 = new item("Better helmet", Rarity.PURPLE, Types.GEAR, 2, 4, 89, 220, 8);
    static item item2 = new item("Mana potion", Rarity.WHITE, Types.CONSUMABLE, 6, 0, 1, 25, 1);

    public static void main(String[] args) {
        Inventory.add(item1);
        Inventory.add(item2);
        int inv = item1.getQuantity() + item2.getQuantity();
        System.out.print("Inventory : (" + inv + ")\n");
        item.show(item1);
        item.show(item2);
    }
}
