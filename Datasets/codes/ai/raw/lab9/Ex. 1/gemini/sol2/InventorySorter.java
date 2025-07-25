import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InventorySorter {
    public static void sort(List<Item> items, String sortBy, String order) {
        Comparator<Item> comparator = null;
        switch (sortBy.toLowerCase()) {
            case "name":
                comparator = Comparator.comparing(Item::getName);
                break;
            case "value":
                comparator = Comparator.comparingInt(Item::getValue);
                break;
            default:
                System.out.println("Invalid sort criteria: " + sortBy + ". Sorting by default (value).");
                comparator = Comparator.comparingInt(Item::getValue);
                break;
        }

        if (order.equalsIgnoreCase("descending")) {
            comparator = comparator.reversed();
        } else if (!order.equalsIgnoreCase("ascending")) {
            System.out.println("Invalid sort order: " + order + ". Using ascending order.");
        }

        if (comparator != null) {
            items.sort(comparator);
            System.out.println("Inventory sorted by " + sortBy.toLowerCase() + " in " + order.toLowerCase() + " order.");
        }
    }
}