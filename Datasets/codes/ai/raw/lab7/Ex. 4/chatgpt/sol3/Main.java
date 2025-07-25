public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 22, true, false),
            new Person("Bob", 35, false, true),
            new Person("Charlie", 25, true, true),
            new Person("Diana", 60, false, true),
            new Person("Eve", 45, false, false),
            new Person("Frank", 19, true, false),
            new Person("Grace", 28, true, true),
        };

        Filter studentFilter = new StudentFilter();
        Filter lecturerFilter = new LecturerFilter();
        Filter taFilter = new TAFilter();
        Filter seniorFilter = new SeniorFilter();

        System.out.println("Students:");
        printPeople(studentFilter.apply(people));

        System.out.println("\nLecturers:");
        printPeople(lecturerFilter.apply(people));

        System.out.println("\nTAs:");
        printPeople(taFilter.apply(people));

        System.out.println("\nSeniors:");
        printPeople(seniorFilter.apply(people));

        // Composition: TAs -> then Seniors
        System.out.println("\nSenior TAs:");
        printPeople(seniorFilter.apply(taFilter.apply(people)));
    }

    private static void printPeople(Person[] people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
