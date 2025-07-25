public class SeniorFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return filter(people, p -> p.getAge() > 55);
    }

    private Person[] filter(Person[] people, java.util.function.Predicate<Person> predicate) {
        return java.util.Arrays.stream(people).filter(predicate).toArray(Person[]::new);
    }
}
