public abstract class AgeFilter extends Filter {
    protected int minAge;
    protected int maxAge;

    public AgeFilter(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, person -> person.getAge() >= minAge && person.getAge() <= maxAge);
    }

    private Person[] filterPeople(Person[] people, java.util.function.Predicate<Person> predicate) {
        return java.util.Arrays.stream(people)
                .filter(predicate)
                .toArray(Person[]::new);
    }
}
