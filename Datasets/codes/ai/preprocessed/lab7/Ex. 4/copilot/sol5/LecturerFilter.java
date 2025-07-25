public class LecturerFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, person -> person.isTeaches() && !person.isStudies());
    }
}