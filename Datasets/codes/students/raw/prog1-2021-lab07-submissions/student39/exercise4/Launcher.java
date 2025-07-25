package lu.uni.programming1.lab7.exercise4;

import java.time.LocalDate;

public class Launcher {
    public static void main(String[] args) {
        Person[] people = new Person[7];
        people[0] = new Person("Cierra", false, true, LocalDate.of(1987, 3, 4) );
        people[1] = new Person("Alden", true, true, LocalDate.of(1998, 5, 12) );
        people[2] = new Person("Thomas", false, true, LocalDate.of(1965, 12, 25) );
        people[3] = new Person("Miranda", false, true, LocalDate.of(1974, 11, 29) );
        people[4] = new Person("Brandy", true, false, LocalDate.of(1999, 6, 20) );
        people[5] = new Person("Alvaro", false, true, LocalDate.of(1963, 2, 18) );
        people[6] = new Person("Maggie", true, false, LocalDate.of(2001, 8, 23) );

        Filter filter = new Filter();
        
        System.out.println(getNames(people));
        System.out.println(getNames(filter.senior(filter.lecturer(people))));
        System.out.println(getNames(filter.ta(people)));
        System.out.println(getNames(filter.junior(people)));
        
    }

    public static String getNames(Person[] people) {
        String names = "";
        for (int i = 0; i < people.length; i++) {
            names += people[i].getName() + " ";
        }
        return names;
    }
}
