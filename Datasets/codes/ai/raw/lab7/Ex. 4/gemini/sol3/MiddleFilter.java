import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiPredicate;

public public final class MiddleFilter extends AgeRangeFilter {
    public MiddleFilter() {
        super((p, threshold) -> p.age() > 28 && p.age() <= 55, 0); // Using BiPredicate
    }
}
