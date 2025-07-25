import java.util.function.Predicate;

public class FilterUtils {
    public static Person[] filter(Person[] people, Predicate<Person> condition) {
        int count = 0;
        for (Person p : people) {
            if (condition.test(p)) count++;
        }

        Person[] result = new Person[count];
        int index = 0;
        for (Person p : people) {
            if (condition.test(p)) result[index++] = p;
        }

        return result;
    }
}