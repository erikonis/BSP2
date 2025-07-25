public class FilterDemo {
    public static void main(String[] args) {
        // Create sample people
        Person[] people = {
            new Person("Alice", 25, false, true),  // Student
            new Person("Bob", 30, true, false),    // Lecturer
            new Person("Charlie", 22, true, true),  // TA
            new Person("Diana", 60, true, false),   // Senior Lecturer
            new Person("Eve", 40, false, true)      // Mature Student
        };

        // Create filters
        Filter lecturerFilter = new RoleFilters.LecturerFilter();
        Filter taFilter = new RoleFilters.TAFilter();
        Filter seniorFilter = new AgeFilters.SeniorFilter();
        Filter juniorFilter = new AgeFilters.JuniorFilter();

        // Test individual filters
        System.out.println("All Lecturers:");
        printPeople(lecturerFilter.filter(people));

        System.out.println("\nAll TAs:");
        printPeople(taFilter.filter(people));

        System.out.println("\nAll Seniors:");
        printPeople(seniorFilter.filter(people));

        // Test filter composition
        System.out.println("\nSenior Lecturers:");
        Filter seniorLecturers = lecturerFilter.andThen(seniorFilter);
        printPeople(seniorLecturers.filter(people));

        System.out.println("\nJunior Students:");
        Filter juniorStudents = new RoleFilters.StudentFilter().andThen(juniorFilter);
        printPeople(juniorStudents.filter(people));
    }

    private static void printPeople(Person[] people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}