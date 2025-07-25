import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiPredicate;

public public final class SeniorFilter extends AgeRangeFilter {
    public SeniorFilter() {
        super((p, threshold) -> p.age() > 55, 0); // Using BiPredicate
    }
}