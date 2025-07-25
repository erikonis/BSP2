import ecs.Component;
import ecs.Entity;

/**
 * Tracks equipment status and slot information
 */
public class EquippedComponent extends Component {
    public enum EquipmentSlot {
        HEAD,
        CHEST,
        HANDS,
        LEGS,
        FEET,
        MAIN_HAND,
        OFF_HAND,
        ACCESSORY
    }

    private EquipmentSlot slot;
    private Entity equipper;
    private boolean isEquipped;
    private long equippedTime;

    public EquippedComponent(EquipmentSlot slot) {
        this.slot = slot;
        this.isEquipped = false;
    }

    public void equip(Entity equipper) {
        if (isEquipped) return;

        this.equipper = equipper;
        this.isEquipped = true;
        this.equippedTime = System.currentTimeMillis();

        // Notify systems about equipment change
        getOwner().getWorld().getSystem(EquipmentSystem.class)
            .onEquipmentChanged(getOwner(), true, slot);
    }

    public void unequip() {
        if (!isEquipped) return;

        // Notify systems about equipment change
        getOwner().getWorld().getSystem(EquipmentSystem.class)
            .onEquipmentChanged(getOwner(), false, slot);

        this.equipper = null;
        this.isEquipped = false;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public EquipmentSlot getSlot() {
        return slot;
    }

    public Entity getEquipper() {
        return equipper;
    }

    public long getEquippedDuration() {
        return isEquipped ? System.currentTimeMillis() - equippedTime : 0;
    }

    @Override
    public void onRemoved() {
        if (isEquipped) {
            unequip();
        }
        super.onRemoved();
    }
}