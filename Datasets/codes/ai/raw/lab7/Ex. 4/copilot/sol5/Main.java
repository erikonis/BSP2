public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25, false, true),
            new Person("Bob", 30, true, false),
            new Person("Charlie", 60, true, false),
            new Person("Dave", 22, true, true),
            new Person("Eve", 45, false, true)
        };

        Filter lecturerFilter = new LecturerFilter();
        Filter seniorFilter = new SeniorFilter();
        Filter juniorFilter = new JuniorFilter();

        Person[] lecturers = lecturerFilter.apply(people);
        Person[] seniors = seniorFilter.apply(lecturers);
        Person[] juniors = juniorFilter.apply(people);

        System.out.println("Lecturers:");
        printPeople(lecturers);

        System.out.println("Seniors:");
        printPeople(seniors);

        System.out.println("Juniors:");
        printPeople(juniors);
    }

    private static void printPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person.getName() + ", Age: " + person.getAge());
        }
    }
}
