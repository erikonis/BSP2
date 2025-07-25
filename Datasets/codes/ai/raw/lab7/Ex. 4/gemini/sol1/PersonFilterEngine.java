// PersonFilterEngine.java
public class PersonFilterEngine {
    public Person[] applyFilter(Person[] people, Filter filter) {
        return filter.filter(people);
    }

    public Person[] applySequentialFilters(Person[] people, Filter... filters) {
        Person[] currentSet = people;
        for (Filter filter : filters) {
            currentSet = applyFilter(currentSet, filter);
        }
        return currentSet;
    }
}