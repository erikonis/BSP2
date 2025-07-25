public class SellItemOperation implements InventoryOperation {
    private int index;

    public SellItemOperation(int index) {
        this.index = index;
    }

    @Override
    public boolean execute(Inventory inventory) {
        return inventory.sellInternal(index);
    }
}