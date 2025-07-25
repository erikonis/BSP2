public class TAFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, person -> person.isStudies() && person.isTeaches());
    }
}
