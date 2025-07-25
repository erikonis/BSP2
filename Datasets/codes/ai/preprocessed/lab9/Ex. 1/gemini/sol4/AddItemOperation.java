public class AddItemOperation implements InventoryOperation {
    private Item item;

    public AddItemOperation(Item item) {
        this.item = item;
    }

    @Override
    public boolean execute(Inventory inventory) {
        return inventory.addInternal(item);
    }
}