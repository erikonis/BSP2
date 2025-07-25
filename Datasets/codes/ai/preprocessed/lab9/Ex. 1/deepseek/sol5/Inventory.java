import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Inventory<T extends Item> {
    private final int capacity;
    private final List<T> items;
    private final Map<ItemType, List<T>> typeIndex;

    public Inventory(int capacity) {
        this.capacity = Math.max(1, capacity);
        this.items = new ArrayList<>();
        this.typeIndex = new EnumMap<>(ItemType.class);
        Arrays.stream(ItemType.values()).forEach(type -> typeIndex.put(type, new ArrayList<>()));
    }

    public boolean addItem(T item) {
        Objects.requireNonNull(item, "Item cannot be null");

        if (items.size() >= capacity) {
            return false;
        }

        items.add(item);
        typeIndex.get(item.getType()).add(item);
        return true;
    }

    public boolean removeItem(T item) {
        Objects.requireNonNull(item, "Item cannot be null");

        boolean removed = items.remove(item);
        if (removed) {
            typeIndex.get(item.getType()).remove(item);
        }
        return removed;
    }

    public List<T> getItemsByType(ItemType type) {
        return Collections.unmodifiableList(typeIndex.get(type));
    }

        /**
     * Gets all items in the inventory (unmodifiable view)
     */
    public List<T> getAllItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Checks if inventory contains an item with given ID
     */
    public boolean contains(String itemId) {
        return items.stream().anyMatch(i -> i.getId().equals(itemId));
    }

    /**
     * Finds item by ID (returns Optional)
     */
    public Optional<T> findItemById(String itemId) {
        return items.stream()
                  .filter(i -> i.getId().equals(itemId))
                  .findFirst();
    }

    /**
     * Gets current item count
     */
    public int getItemCount() {
        return items.size();
    }

    /**
     * Checks if inventory is full
     */
    public boolean isFull() {
        return items.size() >= capacity;
    }

    /**
     * Checks if inventory is empty
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Gets remaining capacity
     */
    public int getRemainingSpace() {
        return capacity - items.size();
    }

    /**
     * Clears all items from inventory
     */
    public void clear() {
        items.clear();
        typeIndex.values().forEach(List::clear);
    }

    /**
     * Sorts items by natural order (value)
     */
    public void sortByValue() {
        items.sort(null);
    }

    /**
     * Sorts items by name
     */
    public void sortByName() {
        items.sort(Comparator.comparing(Item::getName));
    }

    /**
     * Sorts items by rarity
     */
    public void sortByRarity() {
        items.sort(Comparator.comparing(Item::getRarity));
    }

    /**
     * Calculates total value of all items
     */
    public int getTotalValue() {
        return items.stream().mapToInt(Item::getValue).sum();
    }

    /**
     * Counts items of specific type
     */
    public int countItemsByType(ItemType type) {
        return typeIndex.get(type).size();
    }

    /**
     * Removes all items of specific type
     * @return number of items removed
     */
    public int removeAllOfType(ItemType type) {
        List<T> toRemove = typeIndex.get(type);
        int count = toRemove.size();
        items.removeAll(toRemove);
        toRemove.clear();
        return count;
    }

    /**
     * Transfers item to another inventory
     * @return true if transfer succeeded
     */
    public boolean transferItem(T item, Inventory<? super T> target) {
        if (!removeItem(item)) return false;
        if (!target.addItem(item)) {
            addItem(item); // Rollback if transfer fails
            return false;
        }
        return true;
    }
}