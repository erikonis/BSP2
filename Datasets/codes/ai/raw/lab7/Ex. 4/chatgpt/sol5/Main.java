public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[] {
            new Person("Alice", 25, true, false),
            new Person("Bob", 32, false, true),
            new Person("Charlie", 23, true, true),
            new Person("Diana", 60, false, true),
            new Person("Eve", 45, true, false)
        };

        System.out.println("Original People:");
        for (Person p : people) System.out.println(p);

        System.out.println("\nLecturers:");
        Person[] lecturers = new LecturerFilter().apply(people);
        for (Person p : lecturers) System.out.println(p);

        System.out.println("\nSeniors among lecturers:");
        Person[] seniors = new SeniorFilter().apply(lecturers);
        for (Person p : seniors) System.out.println(p);

        System.out.println("\nTAs:");
        Person[] tas = new TAFilter().apply(people);
        for (Person p : tas) System.out.println(p);

        System.out.println("\nJuniors:");
        Person[] juniors = new JuniorFilter().apply(people);
        for (Person p : juniors) System.out.println(p);
    }
}