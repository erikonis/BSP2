public class NoUsageStrategy implements UsageStrategy {
    @Override
    public void use(Item item, Inventory inventory) {
        System.out.println(item.getName() + " cannot be used.");
    }
}