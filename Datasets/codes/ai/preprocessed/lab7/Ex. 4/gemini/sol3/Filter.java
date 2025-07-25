import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public interface Filter extends BiFunction<Person, Person[], Boolean> {
    Person[] filter(Person[] people);

    static Person[] apply(Person[] people, Filter filter) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (!filter.apply(person, people)) { // Keep if the filter doesn't exclude
                filteredList.add(person);
            }
        }
        return filteredList.toArray(new Person[0]);
    }

    static Person[] applySequential(Person[] people, Filter... filters) {
        Person[] currentSet = people;
        for (Filter filter : filters) {
            currentSet = apply(currentSet, filter);
        }
        return currentSet;
    }
}