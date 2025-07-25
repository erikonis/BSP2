import model.items.Item;
import model.items.ItemType;
import model.inventory.sorting.InventorySorter;
import model.inventory.sorting.SortDirection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Inventory {
    private final int capacity;
    private final List<InventorySlot> slots;
    private final List<InventoryObserver> observers = new ArrayList<>();

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.slots = new ArrayList<>(capacity);
    }

    public boolean addItem(Item item) {
        if (item.getType() == ItemType.GEAR || slots.size() >= capacity) {
            return tryAddToExistingSlot(item) || tryAddToNewSlot(item);
        }
        return false;
    }

    private boolean tryAddToExistingSlot(Item item) {
        return slots.stream()
                .filter(slot -> slot.canStack(item))
                .findFirst()
                .map(slot -> {
                    slot.increment();
                    notifyObservers();
                    return true;
                })
                .orElse(false);
    }

    private boolean tryAddToNewSlot(Item item) {
        if (slots.size() < capacity) {
            slots.add(new InventorySlot(item));
            notifyObservers();
            return true;
        }
        return false;
    }

    public void sort(InventorySorter sorter, SortDirection direction) {
        sorter.sort(slots, direction);
        notifyObservers();
    }

    // Other inventory methods (remove, use, etc.) would go here

    public void addObserver(InventoryObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.onInventoryChanged(this));
    }
}