public class Inventory {
    private List<Item> items;
    private int capacity;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public boolean add(Item item) {
        if (items.size() < capacity) {
            items.add(item);
            System.out.println("Added " + item.name + " to inventory.");
            return true;
        }
        System.out.println("Inventory is full! Could not add " + item.name);
        return false;
    }

    public int drop(Item item) {
        int initialSize = items.size();
        items.removeIf(i -> i.equals(item));
        int removedCount = initialSize - items.size();
        System.out.println("Removed " + removedCount + " instances of " + item.name);
        return removedCount;
    }

    public boolean drop(int index) {
        if (index >= 0 && index < items.size()) {
            Item removed = items.remove(index);
            System.out.println("Removed item at index " + index + ": " + removed.name);
            return true;
        }
        System.out.println("Invalid index: " + index);
        return false;
    }

    public void use(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            item.use();

            // Remove consumable if no charges left
            if (item instanceof ConsumableItem) {
                ConsumableItem consumable = (ConsumableItem) item;
                if (!consumable.hasCharges()) {
                    items.remove(index);
                    System.out.println(consumable.name + " was removed from inventory as it has no charges left.");
                }
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public boolean sell(int index) {
        if (index >= 0 && index < items.size()) {
            Item item = items.get(index);
            if (item instanceof Sellable) {
                items.remove(index);
                System.out.println("Sold " + item.name + " for " + item.value + " gil.");
                return true;
            } else {
                System.out.println(item.name + " cannot be sold!");
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
        return false;
    }

    // Bonus: Sorting methods
    public void sortByName(boolean ascending) {
        Comparator<Item> comparator = Comparator.comparing(item -> item.name);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        items.sort(comparator);
        System.out.println("Inventory sorted by name " + (ascending ? "ascending" : "descending"));
    }

    public void sortByValue(boolean ascending) {
        Comparator<Item> comparator = Comparator.comparingInt(item -> item.value);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        items.sort(comparator);
        System.out.println("Inventory sorted by value " + (ascending ? "ascending" : "descending"));
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "Inventory is empty.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Inventory Contents (").append(items.size()).append("/").append(capacity).append("):\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append(i).append(": ").append(items.get(i)).append("\n");
        }
        return sb.toString();
    }
}