public class DataList {
    public static void main(String[] args) {
        Person p1 = new Person("Cierra", 1987, 3, 4, "no", "yes");
        Person p2 = new Person("Alden", 1998, 5, 12, "yes", "yes");
        Person p3 = new Person("Thomas", 1965, 12, 25, "no", "yes");
        Person p4 = new Person("Miranda", 1974, 11, 29, "no", "yes");
        Person p5 = new Person("Brandy", 1999, 6, 20, "yes", "no");
        Person p6 = new Person("Alvaro", 1963, 2, 18, "no", "yes");
        Person p7 = new Person("Maggie", 2001, 8, 23, "yes", "no");
        Person list[] = { p1, p2, p3, p4, p5, p6, p7 };
        Person newList[] = new Person[7];

        AbstractFilter junior = new JuniorFilter();
        AbstractFilter middle = new MiddleFilter();
        AbstractFilter senior = new SeniorFilter();
        AbstractFilter student = new StudentFilter();
        AbstractFilter lecturer = new LecturerFilter();
        AbstractFilter TAFilter = new TAFilter();

        // each filter on its own
        junior.print(list);
        middle.print(list);
        senior.print(list);
        student.print(list);
        lecturer.print(list);
        TAFilter.print(list);

        // sequenced filters
        senior.print(lecturer.result(list, newList));
    }
}
