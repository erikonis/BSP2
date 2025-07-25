import model.items.Item;
import model.items.ItemFactory;
import model.items.ItemType;
import model.items.gear.GearStats;
import model.inventory.Inventory;
import enums.Rarity;

public class Main {
    public static void main(String[] args) {
        // Initialize inventory
        Inventory inventory = new Inventory(10);

        // Create items using factory
        Item potion = ItemFactory.createConsumable("health_potion", "Health Potion", 50, Rarity.PINK, 3);
        Item sword = ItemFactory.createGear("steel_sword", "Steel Sword", 300, Rarity.BLUE,
            new GearStats(8, 5, 3));

        // Add items to inventory
        inventory.addItem(potion);
        inventory.addItem(sword);

        // Use items
        potion.use();
        sword.use();

        // More comprehensive demo would go here
    }
}