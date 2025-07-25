public class LecturerFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, person -> person.isTeaches() && !person.isStudies());
    }

    private Person[] filterPeople(Person[] people, java.util.function.Predicate<Person> predicate) {
        return java.util.Arrays.stream(people)
                .filter(predicate)
                .toArray(Person[]::new);
    }
}
