import java.util.function.Predicate;
import java.util.function.IntPredicate;

public interface Filter extends Predicate<Person> {
    Person[] filter(Person[] people);

    @Override
    default boolean test(Person person) {
        return !filter(new Person[]{person})[0].equals(person); // Exclude if filtered out
    }

    static Person[] apply(Person[] people, Filter filter) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        return java.util.Arrays.stream(people)
                .filter(filter.negate()) // Keep if the filter doesn't exclude
                .toArray(Person[]::new);
    }

    static Person[] applySequential(Person[] people, Filter... filters) {
        Person[] currentSet = people;
        for (Filter filter : filters) {
            currentSet = apply(currentSet, filter);
        }
        return currentSet;
    }
}
