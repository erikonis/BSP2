public class TAFilter extends Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.isTA())
                     .toArray(Person[]::new);
    }
}

