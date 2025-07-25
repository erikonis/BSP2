import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiPredicate;

public public final class JuniorFilter extends AgeRangeFilter {
    public JuniorFilter() {
        super((p, threshold) -> p.age() >= 18 && p.age() <= 28, 0); // Using BiPredicate
    }
}