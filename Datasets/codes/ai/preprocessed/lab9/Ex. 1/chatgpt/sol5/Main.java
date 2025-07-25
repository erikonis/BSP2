public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory(10);

        inv.add(new Trash("Rusty Screw", 1, Rarity.WHITE));
        inv.add(new Consumable("Potion", 50, Rarity.GREEN, 2));
        inv.add(new Gear("Steel Helm", 150, Rarity.BLUE, 5, 4, 3));

        inv.print();
        inv.use(1); // use consumable
        inv.use(1); // use again (now depleted)
        inv.use(1); // can't use

        inv.sell(0); // sell trash
        inv.print();

        inv.sortByName(true);
        inv.print();
    }
}