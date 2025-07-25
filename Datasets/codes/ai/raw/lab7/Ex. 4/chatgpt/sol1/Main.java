public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", true, false, 22),
            new Person("Bob", false, true, 35),
            new Person("Charlie", true, true, 26),
            new Person("David", false, true, 58),
            new Person("Eve", true, false, 62)
        };

        PersonFilter lecturerFilter = new LecturerFilter();
        PersonFilter seniorFilter = new SeniorFilter();
        PersonFilter juniorFilter = new JuniorFilter();

        System.out.println("All people:");
        for (Person p : people) System.out.println(p);

        System.out.println("\nLecturers:");
        for (Person p : lecturerFilter.apply(people)) System.out.println(p);

        System.out.println("\nSeniors among lecturers:");
        for (Person p : seniorFilter.apply(lecturerFilter.apply(people))) System.out.println(p);

        System.out.println("\nJuniors:");
        for (Person p : juniorFilter.apply(people)) System.out.println(p);
    }
}
