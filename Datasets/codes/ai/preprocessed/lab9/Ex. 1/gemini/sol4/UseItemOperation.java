public class UseItemOperation implements InventoryOperation {
    private int index;

    public UseItemOperation(int index) {
        this.index = index;
    }

    @Override
    public boolean execute(Inventory inventory) {
        return inventory.useInternal(index);
    }
}