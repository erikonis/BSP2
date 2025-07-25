import java.time.LocalDate;

public class Launcher {

    public static void main(String[] args) {
        Filter lecturer = new Lecturer();
        Filter student = new Student();
        Filter ta = new TA();
        Filter junior = new Junior();
        Filter middle = new Middle();
        Filter senior = new Senior();

        Person person1 = new Person("Cierra", LocalDate.of(1987, 3, 4), false, true);
        Person person2 = new Person("Alden", LocalDate.of(1998, 5, 12), true, true);
        Person person3 = new Person("Thomas", LocalDate.of(1965, 12, 25), false, true);
        Person person4 = new Person("Miranda", LocalDate.of(1974, 11, 29), false, true);
        Person person5 = new Person("Brandy", LocalDate.of(1999, 6, 20), true, false);
        Person person6 = new Person("Alvaro", LocalDate.of(1963, 2, 18), false, true);
        Person person7 = new Person("Maggie", LocalDate.of(2001, 8, 23), true, false);

        Person[] group = new Person[] { person1, person2, person3, person4, person5, person6, person7 };

        System.out.println(print(lecturer.filter(group)));
        System.out.println(print(student.filter(group)));
        System.out.println(print(ta.filter(group)));
        System.out.println(print(junior.filter(group)));
        System.out.println(print(middle.filter(group)));
        System.out.println(print(senior.filter(group)));
        System.out.println(print(middle.filter(lecturer.filter(group)))); // filterinng the filtered subgroup
    }

    public static String print(Person[] subgroup) {
        String result = "";
        for (int i = 0; i < subgroup.length; i++) {
            result += subgroup[i].output() + "\n";
        }
        return result + "-----------------------";
    }
}
