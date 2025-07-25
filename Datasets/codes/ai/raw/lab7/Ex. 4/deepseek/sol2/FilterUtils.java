public class FilterUtils {
    public static Person[] filterPeople(Person[] people, java.util.function.Predicate<Person> condition) {
        // First pass - count matches
        int count = 0;
        for (Person person : people) {
            if (person != null && condition.test(person)) {
                count++;
            }
        }

        // Second pass - populate result
        Person[] result = new Person[count];
        int index = 0;
        for (Person person : people) {
            if (person != null && condition.test(person)) {
                result[index++] = person;
            }
        }
        return result;
    }

    public static Filter combineFilters(Filter... filters) {
        return people -> {
            Person[] current = people;
            for (Filter filter : filters) {
                current = filter.apply(current);
            }
            return current;
        };
    }
}