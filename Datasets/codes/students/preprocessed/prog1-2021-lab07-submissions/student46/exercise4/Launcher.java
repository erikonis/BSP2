public class Launcher {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Cierra", 1987, 3, 4, false, true),
            new Person("Aiden", 1998, 5, 12, true, true),
            new Person("Thomas", 1965, 12, 25, false, true),
            new Person("Miranda", 1974, 11, 29, false, true),
            new Person("Brandy", 1999, 6, 20, true, false),
            new Person("Alvaro", 1963, 2, 18, false, true),
            new Person("Maggie", 2001, 8, 23, true, false)
        };

        BooleanFilter lecturer = new BooleanFilter("lecturer");
        AgeFilter senior = new AgeFilter("senior");
        Person[] seniorLecturers = senior.applyFilter(lecturer.applyFilter(people));
        // Print final filtered array to see that it is correctly stored
        for (int i = 0; i < seniorLecturers.length; i++) {
            System.out.println(seniorLecturers[i]);
        }
        System.out.println("-------------------------");

        BooleanFilter ta = new BooleanFilter("ta");
        Person[] tas = ta.applyFilter(people);
        for (int i = 0; i < tas.length; i++) {
            System.out.println(tas[i]);
        }
        System.out.println("-------------------------");

        AgeFilter junior = new AgeFilter("junior");
        Person[] juniors = junior.applyFilter(people);
        for (int i = 0; i < juniors.length; i++) {
            System.out.println(juniors[i]);
        }
        System.out.println("-------------------------");
    }
}
