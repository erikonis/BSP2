public class FilterDemo {
    public static void main(String[] args) {
        // Create sample people
        Person[] people = {
            new Person("Alice", 25, false, true),   // Student
            new Person("Bob", 30, true, false),     // Lecturer
            new Person("Charlie", 22, true, true),   // TA
            new Person("David", 60, true, false),    // Senior Lecturer
            new Person("Eve", 40, false, true),      // Mature Student
            new Person("Frank", 50, true, true),     // Senior TA
            new Person("Grace", 20, false, true)     // Junior Student
        };

        // Test individual filters
        System.out.println("=== Individual Filters ===");
        testFilter(new LecturerFilter(), people, "Lecturers");
        testFilter(new StudentFilter(), people, "Students");
        testFilter(new TAFilter(), people, "TAs");
        testFilter(new JuniorFilter(), people, "Juniors");
        testFilter(new MiddleFilter(), people, "Middle-aged");
        testFilter(new SeniorFilter(), people, "Seniors");

        // Test composite filter
        System.out.println("\n=== Composite Filter ===");
        Filter composite = new CompositeFilter(
            new LecturerFilter(),
            new SeniorFilter()
        );
        testFilter(composite, people, "Senior Lecturers");
    }

    private static void testFilter(Filter filter, Person[] people, String description) {
        System.out.println("\n" + description + ":");
        Person[] filtered = filter.filter(people);
        for (Person person : filtered) {
            System.out.println(person);
        }
    }
}