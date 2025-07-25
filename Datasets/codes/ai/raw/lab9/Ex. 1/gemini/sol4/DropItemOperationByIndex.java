public class DropItemOperationByIndex implements InventoryOperation {
    private int index;

    public DropItemOperationByIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean execute(Inventory inventory) {
        return inventory.dropInternal(index);
    }
}