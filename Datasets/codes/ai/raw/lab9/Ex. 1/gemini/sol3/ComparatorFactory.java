import java.util.Comparator;

public class ComparatorFactory {
    public static Comparator<Item> getComparator(String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "name":
                return Comparator.comparing(Item::getName);
            case "value":
                return Comparator.comparingInt(Item::getValue);
            default:
                System.out.println("Invalid sort criteria: " + sortBy + ".");
                return null;
        }
    }
}