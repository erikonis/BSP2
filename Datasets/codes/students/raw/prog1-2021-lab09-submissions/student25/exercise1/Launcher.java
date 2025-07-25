package lu.uni.programming1.lab9.exercise1;

public class Launcher {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);
        GearItem betterHelmet = new GearItem(10, 6, 8, "Better Helmet", 250, Rarity.PURPLE);
        ConsumableItem manaPotion = new ConsumableItem(2, "Mana Potion", 35, Rarity.WHITE);
        GearItem helmet = new GearItem(5, 3, 4, "Helmet", 150, Rarity.BLUE);
        ConsumableItem healthPotion = new ConsumableItem(2, "Health Potion", 50, Rarity.WHITE);
        TrashItem garbage = new TrashItem("Garbage", 1, Rarity.WHITE);
        
        inventory.add(betterHelmet);
        inventory.add(manaPotion);

        System.out.println(inventory + "\n");

        inventory.add(helmet);
        inventory.add(healthPotion);
        inventory.add(helmet);

        inventory.drop(helmet);
        inventory.add(helmet);
        inventory.add(garbage);
        healthPotion.use();
        healthPotion.use();
        healthPotion.use();
        inventory.use(3);
        inventory.use(1);
        inventory.use(1);
        inventory.sell(0);
        inventory.sell(1);
        inventory.sell(2);

        System.out.println(inventory);
    }
}
