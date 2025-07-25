public class ConsumableUsageStrategy implements UsageStrategy {
    @Override
    public void use(Item item, Inventory inventory) {
        if (item instanceof ConsumableItem) {
            ConsumableItem consumable = (ConsumableItem) item;
            if (consumable.getCharges() > 0) {
                consumable.setCharges(consumable.getCharges() - 1);
                System.out.println("Used " + consumable.getName() + ". Charges remaining: " + consumable.getCharges());
                if (consumable.getCharges() == 0) {
                    inventory.removeItem(item); // Use a new internal remove method
                    System.out.println(consumable.getName() + " has no charges left and was removed from the inventory.");
                }
            } else {
                System.out.println(consumable.getName() + " has no charges left.");
            }
        } else {
            System.out.println("Error: Attempted to use non-consumable with ConsumableUsageStrategy.");
        }
    }
}