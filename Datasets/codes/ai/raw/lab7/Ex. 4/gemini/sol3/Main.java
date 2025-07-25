import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.List;
import java.util.function.BiPredicate;

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
