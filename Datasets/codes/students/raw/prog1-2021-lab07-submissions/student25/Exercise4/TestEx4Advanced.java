package Exercise4;

import java.util.HashSet;
import java.util.Set;

public class TestEx4Advanced {
    public static void main(String[] args) {
        Person cierra = new Person("Cierra", 1987, 3, 4, false, true);
        Person alden = new Person("Alden", 1998, 5, 12, true, true);
        Person thomas = new Person("Thomas", 1964, 12, 25, false, true);
        Person miranda = new Person("Miranda", 1974, 11, 29, false, true);
        Person brandy = new Person("Brandy", 1999, 6, 29, true, false);
        Person alvaro = new Person("Alvaro", 1963, 2, 18, false, true);
        Person maggie = new Person("Maggie", 2001, 8, 23, true, false);

        System.out.println("  *The complet list is: ");
        System.out.println(cierra);
        System.out.println(alden);
        System.out.println(thomas);
        System.out.println(miranda);
        System.out.println(brandy);
        System.out.println(alvaro);
        System.out.println(maggie);

        Set<Person> list = new HashSet<>();
        list.add(cierra);
        list.add(alden);
        list.add(thomas);
        list.add(miranda);
        list.add(brandy);
        list.add(alvaro);
        list.add(maggie);

        System.out.println("--------------------------------\n");


        System.out.println(" *The list of the students is:");
        StudentFilterAdvanced filter = new StudentFilterAdvanced();
        filter(list, filter);

        System.out.println("--------------------------------\n");



        // System.out.println(" *The list of the lecturers is:");
        // filter = new Lecturerfilter();
        // Set<Person> teachers = filter.doFilter(list);
        // System.out.println(teachers);

        // System.out.println("--------------------------------\n");



        // System.out.println(" *The list of the Senior lecturers is:");
        // filter(teachers, new SeniorFilter());

        // System.out.println("--------------------------------\n");



         System.out.println(" *The list of the TAS is:");
         filter(list, new TAFilterAdvanced());

         System.out.println("--------------------------------\n");



         System.out.println(" *The list of the Junior is:");
         filter(list, new JuniorFilterAdv());

         System.out.println("--------------------------------\n");



        System.out.println(" *The list of the Middle is:");
        filter(list, new MiddleFilterAdvanced());

        System.out.println("--------------------------------\n");



        System.out.println(" *The list of the Senior is:");
        filter(list, new SeniorFilterAdvanced());

        
    }

    private static void filter(Set<Person> list, FilterAdvanced filter) {
        Set<Person> filteredList;
        filteredList = filter.doFilter(list);
        System.out.println(filteredList);
        //this new method is just a shortcut (utility method) to avoid repetition
    }
    
}
