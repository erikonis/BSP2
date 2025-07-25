package model.inventory.sorting;

import model.inventory.InventorySlot;

import java.util.Comparator;

public class NameSortStrategy implements InventorySorter {
    @Override
    public void sort(List<InventorySlot> slots, SortDirection direction) {
        applySort(slots, Comparator.comparing(slot -> slot.getItem().getName()), direction);
    }
}