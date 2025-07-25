import java.util.Objects;

public class NameEqualityUtil {
    public static boolean areNamesEqual(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            return obj1 == null && obj2 == null;
        }

        if (!(obj1 instanceof NamedEntity) || !(obj2 instanceof NamedEntity)) {
            return false;
        }

        NamedEntity namedObj1 = (NamedEntity) obj1;
        NamedEntity namedObj2 = (NamedEntity) obj2;

        return Objects.equals(namedObj1.getName(), namedObj2.getName());
    }
}