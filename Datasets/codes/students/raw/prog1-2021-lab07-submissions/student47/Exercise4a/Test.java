package Exercise4a;

//This approach has a subclass for every filter and creates a new list everytime(I like version b more, honestly, but this one feels safer?)

public class Test {
    public static Date today = new Date(2021, 11, 7);

    public static void main(String[] args) {

        Person p1 = new Person("Cierra", new Date(1987, 3, 4), false, true);
        Person p2 = new Person("Aiden", new Date(1998, 5, 12), true, true);
        Person p3 = new Person("Thomas", new Date(1965, 12, 25), false, true);
        Person p4 = new Person("Miranda", new Date(1974, 11, 29), false, true);
        Person p5 = new Person("Brandy", new Date(1989, 6, 20), true, false);
        Person p6 = new Person("Alvaro", new Date(1963, 2, 18), false, true);
        Person p7 = new Person("Maggie", new Date(2001, 2, 18), true, false);
        List l1 = new List(10);

        l1.addPerson(p1);
        l1.addPerson(p2);
        l1.addPerson(p3);
        l1.addPerson(p4);
        l1.addPerson(p5);
        l1.addPerson(p6);
        l1.addPerson(p7);

        System.out.println(l1);

        Seniors l2 = new Seniors(l1);

        Juniors l3 = new Juniors(l1);
        TAs l4 = new TAs(l1);

        l2.only();

        Lecturers l21 = new Lecturers(l2);
        l21.only();
        System.out.println(l21);

        l3.only();
        System.out.println(l3);

        l4.only();
        System.out.println(l4);

    }
}
