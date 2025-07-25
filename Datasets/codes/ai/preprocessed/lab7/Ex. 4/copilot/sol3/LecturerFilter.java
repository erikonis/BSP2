import java.util.function.Predicate;

public class LecturerFilter implements Filter {
    @Override
    public Person[] apply(Person[] people, Predicate<Person> predicate) {
        return Arrays.stream(people)
                     .filter(predicate)
                     .toArray(Person[]::new);
    }
}