public class StudentFilter implements Filter {
    @Override
    public Person[] apply(Person[] people) {
        return Arrays.stream(people)
                     .filter(person -> person.isStudent())
                     .toArray(Person[]::new);
    }
}