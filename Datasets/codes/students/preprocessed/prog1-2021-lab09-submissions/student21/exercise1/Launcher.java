
public class Launcher {

    public static void show(Inventory inv) {
        for (Item item : inv.getItems()) {
            System.out.println(item);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Item helmet = new GearItem("Helmet", 150, Rarity.BLUE, 5, 3, 4);
        Item betterHelmet = new GearItem("Better Helmet", 250, Rarity.PURPLE, 10, 6, 8);
        Item healthPotion = new ConsumableItem("Health Potion", 50, Rarity.WHITE, 4);
        Item garbage = new TrashItem("Garbage", 1, Rarity.WHITE);
        Item anotherHelmet = new GearItem("Helmet", 170, Rarity.BLUE, 6, 4, 5);
        Item sameAnotherHelmet = new GearItem("Helmet", 170, Rarity.BLUE, 6, 4, 5);
        Item manaPotion = new ConsumableItem("Mana Potion", 100, Rarity.WHITE, 2);

        Inventory inv = new Inventory(6);

        inv.add(helmet);
        inv.add(healthPotion);
        inv.add(garbage);
        inv.add(anotherHelmet);
        inv.add(manaPotion);
        inv.add(sameAnotherHelmet);
        inv.add(betterHelmet);

        show(inv);

        inv.sort(true, true);

        show(inv);

        inv.sort(false, false);

        show(inv);

        inv.drop(anotherHelmet);

        inv.add(betterHelmet);

        

        inv.use(1);
        inv.use(0);

        inv.drop(3);

        inv.use(0);

        inv.add(helmet);

        inv.sell(2);

        inv.sell(0);

        inv.drop(3);
    }
}
