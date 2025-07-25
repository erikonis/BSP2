public class SeniorFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.getAge() > 55)
                     .toArray(Person[]::new);
    }
}