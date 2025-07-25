package systems;

import ecs.Entity;
import ecs.System;
import ecs.World;
import components.*;
import enums.Rarity;

import java.util.Set;
import java.util.HashSet;

public class ItemUseSystem extends System {
    public ItemUseSystem(World world) {
        super(world);
    }

    @Override
    public Set<Class<? extends Component>> getRequiredComponents() {
        Set<Class<? extends Component>> set = new HashSet<>();
        set.add(ItemComponent.class);
        return set;
    }

    @Override
    public void update(float deltaTime) {
        for (Entity entity : world.getEntitiesWith(getRequiredComponents())) {
            if (entity.hasComponent(MarkedForUseComponent.class)) {
                useItem(entity);
                entity.removeComponent(MarkedForUseComponent.class);
            }
        }
    }

    public void useItem(Entity item) {
        if (item.hasComponent(ChargesComponent.class) && 
            item.hasComponent(NameComponent.class)) {
            handleConsumable(item);
        } 
        else if (item.hasComponent(GearStatsComponent.class) && 
                 item.hasComponent(NameComponent.class)) {
            handleGear(item);
        }
        else if (item.hasComponent(NameComponent.class)) {
            handleTrashItem(item);
        }
    }

    private void handleConsumable(Entity item) {
        ChargesComponent charges = item.getComponent(ChargesComponent.class);
        NameComponent name = item.getComponent(NameComponent.class);
        RarityComponent rarity = item.getComponent(RarityComponent.class);
        
        if (charges.getCurrentCharges() > 0) {
            charges.useCharge();
            
            System.out.printf("Used %s (%s). Charges left: %d/%d%n",
                name.getName(),
                rarity.getRarity().toString().toLowerCase(),
                charges.getCurrentCharges(),
                charges.getMaxCharges());

            // Auto-remove if no charges left
            if (charges.getCurrentCharges() <= 0) {
                System.out.println("➤ " + name.getName() + " has been depleted!");
                if (item.hasComponent(InventorySlotComponent.class)) {
                    item.getComponent(InventorySlotComponent.class).markForRemoval();
                }
            }
        } else {
            System.out.println("✖ Cannot use " + name.getName() + " - no charges remaining!");
        }
    }

    private void handleGear(Entity item) {
        GearStatsComponent stats = item.getComponent(GearStatsComponent.class);
        NameComponent name = item.getComponent(NameComponent.class);
        RarityComponent rarity = item.getComponent(RarityComponent.class);
        ValueComponent value = item.getComponent(ValueComponent.class);
        
        System.out.printf("⚔ Equipped %s (%s) worth %d gil%n",
            name.getName(),
            rarity.getRarity().toString().toLowerCase(),
            value.getValue());
            
        System.out.printf("   Stats: Critical Hit: +%d | Determination: +%d | Direct Hit: +%d%n",
            stats.getCriticalHit(),
            stats.getDetermination(),
            stats.getDirectHit());
    }

    private void handleTrashItem(Entity item) {
        NameComponent name = item.getComponent(NameComponent.class);
        ValueComponent value = item.getComponent(ValueComponent.class);
        RarityComponent rarity = item.getComponent(RarityComponent.class);
        
        System.out.printf("🗑 %s (%s) was used but has no effect (Value: %d gil)%n",
            name.getName(),
            rarity.getRarity().toString().toLowerCase(),
            value.getValue());
    }
}