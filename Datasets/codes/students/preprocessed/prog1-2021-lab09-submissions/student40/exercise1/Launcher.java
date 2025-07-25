public class Launcher {
    public static void main(String[] args) {
        Gear betterHelmet = new Gear("Better Helmet", 250, Rarity.PURPLE, 10, 6, 8);
        Consumable manaPot = new Consumable("Mana Potion", 35, Rarity.WHITE, 2);
        Gear helmet = new Gear("Helmet", 250, Rarity.BLUE, 5, 3, 4);
        Consumable healthPot = new Consumable("Health Potion", 50, Rarity.WHITE, 2);
        Trash garbage = new Trash("Garbage", 1, Rarity.WHITE);

        Inventory invi = new Inventory(20);

        invi.add(betterHelmet);
        invi.add(manaPot);
        System.out.println();
        invi.print();
        System.out.println();

        invi.add(helmet);
        invi.add(garbage);
        System.out.println();

        healthPot.use();
        healthPot.use();
        healthPot.use();
        helmet.use();
        System.out.println(); 

        invi.add(healthPot);
        invi.use(4);
        System.out.println();

        invi.sell(0);
        invi.sell(3);
        System.out.println();

        invi.drop(1);
        invi.drop(betterHelmet);
        System.out.println();

        invi.print();
        
    }
}
