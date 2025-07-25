public class SeniorFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, p -> p.getAge() > 55);
    }
}