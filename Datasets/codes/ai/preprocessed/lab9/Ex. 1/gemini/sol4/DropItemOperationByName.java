public class DropItemOperationByName implements InventoryOperation {
    private Item itemToRemove;

    public DropItemOperationByName(Item itemToRemove) {
        this.itemToRemove = itemToRemove;
    }

    @Override
    public boolean execute(Inventory inventory) {
        return inventory.dropInternal(itemToRemove) > 0;
    }
}