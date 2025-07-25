package model.inventory;

import model.items.Item;

public class InventorySlot {
    private Item item;
    private int quantity;

    public InventorySlot(Item item) {
        this.item = item;
        this.quantity = 1;
    }

    public boolean canStack(Item other) {
        return item.equals(other) && quantity < item.getType().getMaxStackSize();
    }

    public void increment() {
        quantity++;
    }

    public void decrement() {
        if (quantity > 0) {
            quantity--;
        }
    }

    // Getters
    public Item getItem() { return item; }
    public int getQuantity() { return quantity; }
    public boolean isEmpty() { return quantity <= 0; }
}