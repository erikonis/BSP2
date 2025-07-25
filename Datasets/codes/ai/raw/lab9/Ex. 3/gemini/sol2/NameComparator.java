import java.util.Comparator;

public class NameComparator implements Comparator<Object> {
    @Override
    public int compare(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            return obj1 == null ? (obj2 == null ? 0 : -1) : 1;
        }

        String name1 = getName(obj1);
        String name2 = getName(obj2);

        if (name1 != null && name2 != null) {
            return name1.compareTo(name2);
        } else {
            return name1 == null ? (name2 == null ? 0 : -1) : 1;
        }
    }

    private String getName(Object obj) {
        if (obj instanceof Mage) {
            return ((Mage) obj).getName();
        }
        // Add more instanceof checks for other classes with a 'getName()' method if needed
        return null;
    }

    public boolean areNamesEqual(Object obj1, Object obj2) {
        return compare(obj1, obj2) == 0;
    }
}