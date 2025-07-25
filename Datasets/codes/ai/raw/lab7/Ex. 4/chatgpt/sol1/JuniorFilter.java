public class JuniorFilter implements PersonFilter {
    public Person[] apply(Person[] people) {
        return filter(people, p -> p.getAge() >= 18 && p.getAge() <= 28);
    }

    private Person[] filter(Person[] people, java.util.function.Predicate<Person> predicate) {
        return java.util.Arrays.stream(people).filter(predicate).toArray(Person[]::new);
    }
}
