import ecs.*;
import components.*;
import systems.*;
import enums.Rarity;

public class Main {
    public static void main(String[] args) {
        World world = new World();
        
        // Create systems
        world.addSystem(new InventorySystem(world));
        world.addSystem(new ItemUseSystem(world));
        
        // Create player inventory
        Entity inventory = world.createEntity();
        inventory.addComponent(new InventorySlotComponent(10));
        
        // Create a potion
        Entity potion = world.createEntity();
        potion.addComponent(new ItemComponent());
        potion.addComponent(new NameComponent("Health Potion"));
        potion.addComponent(new ValueComponent(50));
        potion.addComponent(new RarityComponent(Rarity.PINK));
        potion.addComponent(new ChargesComponent(3));
        
        // Create a sword
        Entity sword = world.createEntity();
        sword.addComponent(new ItemComponent());
        sword.addComponent(new NameComponent("Steel Sword"));
        sword.addComponent(new ValueComponent(300));
        sword.addComponent(new RarityComponent(Rarity.BLUE));
        sword.addComponent(new GearStatsComponent(8, 5, 3));
        
        // Add items to inventory
        InventorySystem inventorySystem = world.getSystem(InventorySystem.class);
        inventorySystem.addToInventory(inventory, potion);
        inventorySystem.addToInventory(inventory, sword);
        
        // Use items
        ItemUseSystem useSystem = world.getSystem(ItemUseSystem.class);
        useSystem.useItem(potion);
        useSystem.useItem(sword);
        
        // Game loop
        while (true) {
            world.update(1.0f / 60.0f);
            try {
                Thread.sleep(16); // ~60 FPS
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}