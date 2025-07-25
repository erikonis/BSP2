public abstract class Filter {
    public abstract Person[] apply(Person[] people);

    protected Person[] filterPeople(Person[] people, java.util.function.Predicate<Person> predicate) {
        return java.util.Arrays.stream(people)
                .filter(predicate)
                .toArray(Person[]::new);
    }
}