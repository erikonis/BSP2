public record Person(String name, int age, boolean isLecturer, boolean isStudent) {
    public boolean isTA() {
        return isStudent && isLecturer;
    }
}

// Filter.java
import java.util.function.Predicate;

public interface Filter extends Predicate<Person> {
    Person[] filter(Person[] people);

    @Override
    default boolean test(Person person) {
        return !filter(new Person[]{person})[0].equals(person); // Exclude if filtered out
    }

    static Person[] apply(Person[] people, Filter filter) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        return java.util.Arrays.stream(people)
                .filter(filter.negate()) // Keep if the filter doesn't exclude
                .toArray(Person[]::new);
    }

    static Person[] applySequential(Person[] people, Filter... filters) {
        Person[] currentSet = people;
        for (Filter filter : filters) {
            currentSet = apply(currentSet, filter);
        }
        return currentSet;
    }
}

// LecturerFilter.java
public enum LecturerFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> p.isLecturer() && !p.isStudent())
                .toArray(Person[]::new);
    }
}

// StudentFilter.java
public enum StudentFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> p.isStudent() && !p.isLecturer())
                .toArray(Person[]::new);
    }
}

// TAFilter.java
public enum TAFilter implements Filter {
    INSTANCE;

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(Person::isTA)
                .toArray(Person[]::new);
    }
}

// AgeRangeFilter.java
import java.util.function.IntPredicate;

public abstract class AgeRangeFilter implements Filter {
    private final IntPredicate agePredicate;

    protected AgeRangeFilter(int minAge, int maxAge) {
        this.agePredicate = age -> age >= minAge && age <= maxAge;
    }

    protected AgeRangeFilter(IntPredicate predicate) {
        this.agePredicate = predicate;
    }

    @Override
    public Person[] filter(Person[] people) {
        return java.util.Arrays.stream(people)
                .filter(p -> agePredicate.test(p.age()))
                .toArray(Person[]::new);
    }
}

// JuniorFilter.java
public final class JuniorFilter extends AgeRangeFilter {
    public JuniorFilter() {
        super(18, 28);
    }
}

// MiddleFilter.java
public final class MiddleFilter extends AgeRangeFilter {
    public MiddleFilter() {
        super(29, 55);
    }
}

// SeniorFilter.java
public final class SeniorFilter extends AgeRangeFilter {
    public SeniorFilter() {
        super(age -> age > 55);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25, false, true),
                new Person("Bob", 35, true, false),
                new Person("Charlie", 22, true, true),
                new Person("David", 45, false, false),
                new Person("Eve", 60, true, false),
                new Person("Frank", 28, false, true),
                new Person("Grace", 30, true, true)
        };

        System.out.println("Initial set:");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println();

        // Applying Lecturer Filter
        Person[] lecturersRemoved = Filter.apply(people, LecturerFilter.INSTANCE);
        System.out.println("After Lecturer Filter:");
        for (Person p : lecturersRemoved) {
            System.out.println(p);
        }
        System.out.println();

        // Applying Senior Filter to the result of Lecturer Filter
        Person[] seniorsRemovedFromLecturersRemoved = Filter.apply(lecturersRemoved, new SeniorFilter());
        System.out.println("After Senior Filter (applied to lecturers removed):");
        for (Person p : seniorsRemovedFromLecturersRemoved) {
            System.out.println(p);
        }
        System.out.println();

        // Applying Junior Filter to the initial set
        Person[] juniorsRemoved = Filter.apply(people, new JuniorFilter());
        System.out.println("After Junior Filter:");
        for (Person p : juniorsRemoved) {
            System.out.println(p);
        }
        System.out.println();

        // Applying sequential filters: Lecturer then Senior
        Person[] sequentialResult = Filter.applySequential(people, LecturerFilter.INSTANCE, new SeniorFilter());
        System.out.println("After Sequential Filters (Lecturer then Senior):");
        for (Person p : sequentialResult) {
            System.out.println(p);
        }
        System.out.println();
    }
}