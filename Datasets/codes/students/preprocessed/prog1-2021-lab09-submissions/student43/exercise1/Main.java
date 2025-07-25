public class Main {
    public static void main(String[] args) throws Exception {
        GearItem gi1=new GearItem("Better Helmet", 250, Rarity.PURPLE, 10, 6, 8);
        ConsumableItem ci1 = new ConsumableItem("Mana Potion", 35, Rarity.WHITE, 2);
        GearItem gi2=new GearItem("Helmet", 150, Rarity.BLUE, 5, 2, 4);
        ConsumableItem ci2 = new ConsumableItem("Health Potion", 50, Rarity.WHITE, 2);
        TrashItem ti1 = new TrashItem("Garbage", 1, Rarity.WHITE);
        Inventory inv = new Inventory(100);
        inv.add(gi1);
        inv.add(ci1);
        inv.add(gi2);
        inv.add(gi2);
        inv.add(ci2);
        inv.add(ti1);
        inv.drop(gi2);
        inv.add(gi2);
        inv.use(2);
        inv.use(2);
        inv.use(2);
        inv.use(0);
        inv.sell(0);
        inv.sell(3);
        inv.sell(1);
        System.out.println(inv.toString());
    }
}
