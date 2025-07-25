public class MiddleAgedFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, p -> p.getAge() > 28 && p.getAge() <= 55);
    }
}