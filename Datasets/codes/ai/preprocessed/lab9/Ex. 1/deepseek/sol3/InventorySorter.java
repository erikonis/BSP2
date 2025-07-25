import model.inventory.InventorySlot;

import java.util.Comparator;
import java.util.List;

public interface InventorySorter {
    void sort(List<InventorySlot> slots, SortDirection direction);

    default void applySort(List<InventorySlot> slots, Comparator<InventorySlot> comparator, SortDirection direction) {
        slots.sort(direction == SortDirection.ASCENDING ? comparator : comparator.reversed());
    }
}