package lu.uni.programming1.lab9.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(6);

        Item Sandbread = new ConsumableItem("Sand Bread", 1, Colours.PINK, 2);
        Item SabbatduBled = new GearItem("Sabbat du Bled", 1000, Colours.PURPLE, 35, 60, 210);
        Item diamondSword = new TrashItem("Diamond Sword", 0, Colours.WHITE);

        inventory.add(SabbatduBled);
        inventory.add(diamondSword);
        inventory.add(diamondSword);
        inventory.add(Sandbread);
        inventory.add(SabbatduBled);
        inventory.add(Sandbread);
        inventory.add(SabbatduBled);
        System.out.println();
        System.out.print(inventory);
        System.out.println();
        inventory.drop(6);
        inventory.drop(5);
        inventory.drop(diamondSword);
        inventory.add(diamondSword);
        inventory.add(Sandbread);
        inventory.use(0);
        inventory.use(1);
        inventory.use(1);
        inventory.sell(0);
        inventory.sell(2);
        inventory.sell(2);
    }
}
