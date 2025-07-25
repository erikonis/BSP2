public class JuniorFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.getAge() >= 18 && person.getAge() <= 28)
                     .toArray(Person[]::new);
    }
}