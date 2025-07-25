import java.util.Comparator;

public class ItemComparators {
    public static Comparator<Item> byValue(boolean ascending) {
        return ascending ? Comparator.comparingInt(Item::getValue)
                         : Comparator.comparingInt(Item::getValue).reversed();
    }

    public static Comparator<Item> byName(boolean ascending) {
        return ascending ? Comparator.comparing(Item::getName)
                         : Comparator.comparing(Item::getName).reversed();
    }

    public static Comparator<Item> byGearPower() {
        return (a, b) -> {
            if (a instanceof GearItem && b instanceof GearItem) {
                return Integer.compare(((GearItem)a).getPowerScore(), ((GearItem)b).getPowerScore());
            }
            return 0;
        };
    }
}