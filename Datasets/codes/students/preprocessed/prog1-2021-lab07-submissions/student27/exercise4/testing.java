public class testing {
    public static void main(String[] args) {
        Person cierra = new Person(4, 3, 1987, "Cierra", true, false);
        Person aiden = new Person(12, 5, 1998, "Aiden", true, true);
        Person thomas = new Person(25, 12, 1965, "Thomas", false, true);
        Person miranda = new Person(29, 11, 1974, "Miranda", true, false);
        Person brandy = new Person(20, 6, 1999, "Brandy", true, false);
        Person alvaro = new Person(18, 2, 1963, "Alvaro", false, true);
        Person maggie = new Person(23, 8, 2001, "Maggie", true, false);
    
        Table table1 = new Table(cierra, aiden, thomas, miranda, brandy, alvaro, maggie);
        table1.Multifilter("Senior", "Lecturer");
        // table1.FilterLecturer();
        // table1.FilterJunior();
        // table1.FilterTA();
        table1.Displaylist();
    }}
