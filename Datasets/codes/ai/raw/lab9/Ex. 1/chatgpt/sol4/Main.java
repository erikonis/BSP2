public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory(10);

        inv.add(new Trash("Broken Fang", 1, Rarity.WHITE));
        inv.add(new Gear("Knight Helm", 200, Rarity.BLUE, 4, 5, 3));
        inv.add(new Consumable("Elixir", 150, Rarity.PURPLE, 2));

        inv.print();

        inv.use(2); // use elixir
        inv.use(2); // use elixir again, now depleted

        inv.sellAllSellable();

        inv.sort(Comparator.comparing(Item::value).reversed());
        inv.print();

        // Get all gear and print power
        inv.filter(i -> i.is("gear")).forEach(item -> {
            if (item instanceof Gear g) {
                System.out.println(g.name() + " Power: " + g.totalStats());
            }
        });
    }
}
