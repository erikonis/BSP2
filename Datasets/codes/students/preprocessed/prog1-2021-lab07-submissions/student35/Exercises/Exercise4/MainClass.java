import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args)
    {
        Person p1 = new Person("Cierra", LocalDate.of(1987, 03, 04), false, true);
        Person p2 = new Person("Alden", LocalDate.of(1998, 05, 12), true, true);
        Person p3 = new Person("Thomas", LocalDate.of(1965, 12, 25), false, true);
        Person p4 = new Person("Miranda", LocalDate.of(1974, 11, 29), false, true);
        Person p5 = new Person("Brandy", LocalDate.of(1999, 06, 20), true, false);
        Person p6 = new Person("Alvaro", LocalDate.of(1963, 02, 18), false, true);
        Person p7 = new Person("Maggie", LocalDate.of(2001, 8, 23), true, false);

        //PersonList pl = new PersonList(8);
        Filter f = new Filter(8);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        f.add(p5);
        f.add(p6);
        f.add(p7);

        System.out.println(f.printArray());
        System.out.println("---------------");
        
        f.unmodify();
        System.out.println(f.printArray());
        System.out.println("---------------");
        f.searchAgeCategory(18, 28);
        System.out.println(f.printArray());
        System.out.println("---------------");
        f.unmodify();
        System.out.println(f.printArray());
        System.out.println("---------------");
        f.searchProffesion(false, true);
        System.out.println("---------------");
        f.searchAgeCategory(55, Integer.MAX_VALUE);
    }
}