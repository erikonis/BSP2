package src.lu.uni.programming1.lab9.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Inventory inv = new Inventory(10);
        Gear gear1 = new Gear("Helmet", 50, Rarity.PINK, 2, 1, 3);
        Consumable con1 = new Consumable("Health Potion", 100, Rarity.PINK, 3, Effect.HEALING);
        Consumable con2 = new Consumable("Health Potion", 200, Rarity.GREEN, 7, Effect.HEALING);
        Trash trs = new Trash("Nugget", 120);
        Gear gear2 = new Gear("Vest", 150, Rarity.BLUE, 7, 5, 1);

        inv.add(gear1);
        inv.add(gear2);
        inv.add(con1);
        inv.add(con2);
        inv.add(trs);
        inv.add(trs);
        inv.add(trs);
        inv.sort();
        System.out.println(inv.toString());
        inv.sell(4);
        inv.sell(0);
        System.out.println(inv.toString());
        inv.use(con1);
        inv.use(con1);
        inv.use(con1);
        inv.use(con1);
        inv.use(gear1);
        inv.use(trs);
        System.out.println(inv.toString());  
        inv.drop(trs);
        System.out.println(inv.toString());
        inv.sort();
        System.out.println(inv.toString());
    }
}
