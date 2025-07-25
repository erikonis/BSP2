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
                new Person("Grace", 50, true, true),
                new Person("Heidi", 70, false, false)
        };

        System.out.println("--- Initial Set of People ---");
        for (Person person : people) {
            System.out.println(person);
        }

        // Apply Lecturer Filter
        LecturerFilter lecturerFilter = new LecturerFilter();
        Person[] lecturersRemoved = lecturerFilter.filter(people);
        System.out.println("\n--- After Lecturer Filter (Lecturers who only teach removed) ---");
        for (Person person : lecturersRemoved) {
            System.out.println(person);
        }

        // Apply Senior Filter to the result of Lecturer Filter
        SeniorFilter seniorFilter = new SeniorFilter();
        Person[] seniorsRemovedAfterLecturers = seniorFilter.filter(lecturersRemoved);
        System.out.println("\n--- After Senior Filter (Seniors removed from the previous set) ---");
        for (Person person : seniorsRemovedAfterLecturers) {
            System.out.println(person);
        }

        // Apply Junior Filter to the initial set
        JuniorFilter juniorFilter = new JuniorFilter();
        Person[] juniorsRemoved = juniorFilter.filter(people);
        System.out.println("\n--- After Junior Filter (Juniors removed from the initial set) ---");
        for (Person person : juniorsRemoved) {
            System.out.println(person);
        }

        // Sequential composition of filters (Lecturer then Senior)
        FilterPipeline lecturerThenSenior = new FilterPipeline(new LecturerFilter(), new SeniorFilter());
        Person[] resultPipeline = lecturerThenSenior.filter(people);
        System.out.println("\n--- After Lecturer Filter AND Senior Filter (Sequential Composition) ---");
        for (Person person : resultPipeline) {
            System.out.println(person);
        }

        // Test other filters
        StudentFilter studentFilter = new StudentFilter();
        Person[] studentsRemoved = studentFilter.filter(people);
        System.out.println("\n--- After Student Filter (Students who only study removed) ---");
        for (Person person : studentsRemoved) {
            System.out.println(person);
        }

        TAFilter taFilter = new TAFilter();
        Person[] tasRemoved = taFilter.filter(people);
        System.out.println("\n--- After TA Filter (TAs removed) ---");
        for (Person person : tasRemoved) {
            System.out.println(person);
        }

        MiddleFilter middleFilter = new MiddleFilter();
        Person[] middlesRemoved = middleFilter.filter(people);
        System.out.println("\n--- After Middle Filter (Middle-aged removed) ---");
        for (Person person : middlesRemoved) {
            System.out.println(person);
        }
    }
}