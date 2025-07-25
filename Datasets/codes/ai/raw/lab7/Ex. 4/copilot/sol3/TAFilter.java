public class TAFilter implements Filter {
    @Override
    public Person[] apply(Person[] people, Predicate<Person> predicate) {
        return Arrays.stream(people)
                     .filter(predicate)
                     .toArray(Person[]::new);
    }
}

