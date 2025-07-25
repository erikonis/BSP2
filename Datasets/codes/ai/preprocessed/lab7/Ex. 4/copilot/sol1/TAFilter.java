public class TAFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.isTA())
                     .toArray(Person[]::new);
    }
}