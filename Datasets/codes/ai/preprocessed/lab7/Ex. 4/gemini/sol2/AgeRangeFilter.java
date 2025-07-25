import java.util.function.Predicate;
import java.util.function.IntPredicate;

public abstract class AgeRangeFilter implements Filter {
    private final IntPredicate agePredicate;

    protected AgeRangeFilter(int minAge, int maxAge) {
        this.agePredicate = age -> age >= minAge && age <= maxAge;
    }

    protected AgeRangeFilter(IntPredicate predicate) {
        this.agePredicate = predicate;
    }

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> agePredicate.test(p.age()))
                .toArray(Person[]::new);
    }
}