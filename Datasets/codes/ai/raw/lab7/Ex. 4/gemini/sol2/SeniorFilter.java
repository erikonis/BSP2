import java.util.function.Predicate;
import java.util.function.IntPredicate;

public public final class SeniorFilter extends AgeRangeFilter {
    public SeniorFilter() {
        super(age -> age > 55);
    }
}
