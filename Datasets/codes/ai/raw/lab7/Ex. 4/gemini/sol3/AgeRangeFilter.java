import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiPredicate;

public abstract class AgeRangeFilter implements Filter {
    private final BiPredicate<Person, Integer> agePredicate;
    private final int minAge;
    private final int maxAge;

    protected AgeRangeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.agePredicate = (p, threshold) -> p.age() >= minAge && p.age() <= maxAge ? p.age() >= minAge && p.age() <= maxAge : p.age() > threshold; // Dummy threshold usage
    }

    protected AgeRangeFilter(BiPredicate<Person, Integer> predicate, int dummy) { // Different constructor signature
        this.agePredicate = predicate;
        this.minAge = -1;
        this.maxAge = -1;
    }

    @Override
    public Person[] filter(Person[] people) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (!apply(person, people)) {
                filteredList.add(person);
            }
        }
        return filteredList.toArray(new Person[0]);
    }

    @Override
    public Boolean apply(Person person, Person[] allPeople) {
        return agePredicate.test(person, maxAge); // Using maxAge as a dummy threshold
    }
}
