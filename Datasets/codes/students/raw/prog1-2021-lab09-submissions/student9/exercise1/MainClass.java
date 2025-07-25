package lu.uni.programming1.lab9.exercise1;

public class MainClass {
    public static void main(String[] args) {
        Inventory inv = new Inventory(90);

        /*Item i1 = new GearItem("Better Helmet", 250, Color.PURPLE, 10, 6, 8);
        Item i2 = new ConsumableItem("Mana Potion", 35, Color.WHITE, 2);
        Item i3 = new ConsumableItem("Mana Potion", 35, Color.WHITE, 2);
        Item i4 = new ConsumableItem("Mana Potion", 35, Color.WHITE, 2);
        inv.add(i1);
        inv.add(i2);
        inv.add(i3);
        inv.add(i4);
        System.out.println(inv.toString());*/

        Item i3 = new GearItem("Helmet", 150, Color.BLUE, 5, 3, 4);
        Item i4 = new GearItem("Helmet", 150, Color.BLUE, 5, 3, 4);
        Item i5 = new TrashItem("Garbage", 1, Color.WHITE);
        Item i6 = new ConsumableItem("Mana Potion", 35, Color.WHITE, 2);
        Item i7 = new ConsumableItem("Mana Potion", 35, Color.WHITE, 2);
        inv.add(i3);
        inv.add(i4);
        inv.add(i5);
        inv.add(i6);
        inv.drop(i4);
        inv.add(i4);
        System.out.println(inv.toString());
        inv.use(2);
        inv.use(2);
        inv.use(2);
        inv.use(0);
        inv.sell(0);
        inv.add(i7);
        inv.sell(2);
        inv.sell(1);
    }
}
