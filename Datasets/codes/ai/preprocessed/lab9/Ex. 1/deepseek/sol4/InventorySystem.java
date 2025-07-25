import ecs.Entity;
import ecs.System;
import ecs.World;
import components.*;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class InventorySystem extends System {
    private static final int MAX_CAPACITY = 20;

    public InventorySystem(World world) {
        super(world);
    }

    @Override
    public Set<Class<? extends Component>> getRequiredComponents() {
        return new HashSet<>();
    }

    public boolean addToInventory(Entity inventory, Entity item) {
        if (!inventory.hasComponent(InventoryComponent.class)) {
            inventory.addComponent(new InventoryComponent(MAX_CAPACITY));
        }

        InventoryComponent invComp = inventory.getComponent(InventoryComponent.class);

        // Check if inventory is full
        if (invComp.getItems().size() >= invComp.getCapacity()) {
            System.out.println("Inventory is full! Cannot add " +
                item.getComponent(NameComponent.class).getName());
            return false;
        }

        // Check if item is stackable
        if (item.hasComponent(StackableComponent.class)) {
            StackableComponent stackable = item.getComponent(StackableComponent.class);
            for (Entity existingItem : invComp.getItems()) {
                if (existingItem.hasComponent(StackableComponent.class) &&
                    existingItem.getComponent(NameComponent.class).getName().equals(
                        item.getComponent(NameComponent.class).getName())) {

                    StackableComponent existingStack = existingItem.getComponent(StackableComponent.class);
                    if (existingStack.getCurrentStack() < existingStack.getMaxStack()) {
                        existingStack.increaseStack(1);
                        System.out.println("Stacked " +
                            item.getComponent(NameComponent.class).getName() +
                            " (Now: " + existingStack.getCurrentStack() + ")");
                        return true;
                    }
                }
            }
        }

        // Add new item to inventory
        invComp.addItem(item);
        System.out.println("Added " + item.getComponent(NameComponent.class).getName() +
            " to inventory (" + invComp.getItems().size() + "/" + invComp.getCapacity() + ")");
        return true;
    }

    public void removeFromInventory(Entity inventory, Entity item) {
        if (!inventory.hasComponent(InventoryComponent.class)) {
            return;
        }

        InventoryComponent invComp = inventory.getComponent(InventoryComponent.class);
        List<Entity> items = invComp.getItems();

        // Handle stackable items
        if (item.hasComponent(StackableComponent.class)) {
            StackableComponent stack = item.getComponent(StackableComponent.class);
            if (stack.getCurrentStack() > 1) {
                stack.decreaseStack(1);
                System.out.println("Removed 1 from stack of " +
                    item.getComponent(NameComponent.class).getName() +
                    " (Remaining: " + stack.getCurrentStack() + ")");
                return;
            }
        }

        // Remove entire item
        if (items.remove(item)) {
            System.out.println("Removed " +
                item.getComponent(NameComponent.class).getName() + " from inventory");

            // If this was an equipped item, unequip it
            if (item.hasComponent(EquippedComponent.class)) {
                item.removeComponent(EquippedComponent.class);
                System.out.println("➤ " +
                    item.getComponent(NameComponent.class).getName() + " was unequipped");
            }
        }
    }

    public void displayInventory(Entity inventory) {
        if (!inventory.hasComponent(InventoryComponent.class)) {
            System.out.println("No inventory found");
            return;
        }

        InventoryComponent invComp = inventory.getComponent(InventoryComponent.class);
        System.out.println("\n=== INVENTORY (" + invComp.getItems().size() +
                          "/" + invComp.getCapacity() + ") ===");

        int index = 1;
        for (Entity item : invComp.getItems()) {
            NameComponent name = item.getComponent(NameComponent.class);
            RarityComponent rarity = item.getComponent(RarityComponent.class);
            ValueComponent value = item.getComponent(ValueComponent.class);

            System.out.print(index++ + ". " + name.getName() +
                            " (" + rarity.getRarity() + ") - " +
                            value.getValue() + " gil");

            if (item.hasComponent(StackableComponent.class)) {
                StackableComponent stack = item.getComponent(StackableComponent.class);
                System.out.print(" [x" + stack.getCurrentStack() + "]");
            }

            if (item.hasComponent(EquippedComponent.class)) {
                System.out.print(" [EQUIPPED]");
            }

            System.out.println();
        }
    }
}