public class JuniorFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return filterPeople(people, p -> p.getAge() >= 18 && p.getAge() <= 28);
    }
}