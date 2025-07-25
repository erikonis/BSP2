import java.util.Arrays;

// Represents a person with a name, age, and roles
class Person {
    private String name;
    private int age;
    private boolean isLecturer;
    private boolean isStudent;

    public Person(String name, int age, boolean isLecturer, boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isLecturer = isLecturer;
        this.isStudent = isStudent;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isLecturer() {
        return isLecturer;
    }

    public boolean isStudent() {
        return isStudent;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", isLecturer=" + isLecturer +
               ", isStudent=" + isStudent +
               '}';
    }
}

// Interface for all filters
interface Filter {
    Person[] filter(Person[] people);
}

// Abstract base class for person-based filters
abstract class PersonFilter implements Filter {
    @Override
    public Person[] filter(Person[] people) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        Person[] filteredPeople = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (test(person)) {
                filteredPeople[count++] = person;
            }
        }
        return Arrays.copyOf(filteredPeople, count);
    }

    // Abstract method to be implemented by concrete filters
    public abstract boolean test(Person person);
}

// Filters out people who only teach
class LecturerFilter extends PersonFilter {
    @Override
    public boolean test(Person person) {
        return person.isLecturer() && !person.isStudent();
    }
}

// Filters out people who only study
class StudentFilter extends PersonFilter {
    @Override
    public boolean test(Person person) {
        return person.isStudent() && !person.isLecturer();
    }
}

// Filters out people who both study and teach
class TAFilter extends PersonFilter {
    @Override
    public boolean test(Person person) {
        return person.isStudent() && person.isLecturer();
    }
}

// Abstract base class for age-based filters
abstract class AgeFilter implements Filter {
    @Override
    public Person[] filter(Person[] people) {
        if (people == null || people.length == 0) {
            return new Person[0];
        }
        Person[] filteredPeople = new Person[people.length];
        int count = 0;
        for (Person person : people) {
            if (test(person.getAge())) {
                filteredPeople[count++] = person;
            }
        }
        return Arrays.copyOf(filteredPeople, count);
    }

    // Abstract method to be implemented by concrete age filters
    public abstract boolean test(int age);
}

// Filters out people whose age is between 18 and 28 (inclusive)
class JuniorFilter extends AgeFilter {
    @Override
    public boolean test(int age) {
        return age >= 18 && age <= 28;
    }
}

// Filters out people whose age is between 28 and 55 (exclusive upper bound)
class MiddleFilter extends AgeFilter {
    @Override
    public boolean test(int age) {
        return age > 28 && age <= 55;
    }
}

// Filters out people whose age is greater than 55
class SeniorFilter extends AgeFilter {
    @Override
    public boolean test(int age) {
        return age > 55;
    }
}

public class FilterExample {
    // Method to apply a filter to a set of people
    public static Person[] applyFilter(Person[] people, Filter filter) {
        return filter.filter(people);
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25, false, true),
                new Person("Bob", 35, true, false),
                new Person("Charlie", 22, true, true),
                new Person("David", 60, false, false),
                new Person("Eve", 40, true, false),
                new Person("Frank", 19, false, true),
                new Person("Grace", 58, false, false)
        };

        System.out.println("Initial set of people:");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        // Apply Lecturer Filter
        Filter lecturerFilter = new LecturerFilter();
        Person[] lecturers = applyFilter(people, lecturerFilter);
        System.out.println("After applying Lecturer Filter:");
        for (Person person : lecturers) {
            System.out.println(person);
        }
        System.out.println();

        // Apply Senior Filter to the result of Lecturer Filter
        Filter seniorFilter = new SeniorFilter();
        Person[] seniorLecturers = applyFilter(lecturers, seniorFilter);
        System.out.println("After applying Senior Filter to lecturers:");
        for (Person person : seniorLecturers) {
            System.out.println(person);
        }
        System.out.println();

        // Apply Junior Filter to the initial set
        Filter juniorFilter = new JuniorFilter();
        Person[] juniors = applyFilter(people, juniorFilter);
        System.out.println("After applying Junior Filter:");
        for (Person person : juniors) {
            System.out.println(person);
        }
        System.out.println();

        // Apply TA Filter to the initial set
        Filter taFilter = new TAFilter();
        Person[] tas = applyFilter(people, taFilter);
        System.out.println("After applying TA Filter:");
        for (Person person : tas) {
            System.out.println(person);
        }
        System.out.println();

        // Apply Middle Filter to the initial set
        Filter middleFilter = new MiddleFilter();
        Person[] middles = applyFilter(people, middleFilter);
        System.out.println("After applying Middle Filter:");
        for (Person person : middles) {
            System.out.println(person);
        }
        System.out.println();
    }
}