import java.util.function.Predicate;

public interface Filter {
    Person[] apply(Person[] people, Predicate<Person> predicate);
}