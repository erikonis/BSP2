import java.time.LocalDate;

public class Launch {
    public static void main(String[] args) {
        Person[] persons = 
            {
                new Person("Cierra", LocalDate.of(1987, 3, 4),false,true),
                new Person("Alden", LocalDate.of(1998, 5, 12),true,true),
                new Person("Thomas", LocalDate.of(1965, 12, 25),false,true),
                new Person("Miranda", LocalDate.of(1974, 11, 29),false,true),
                new Person("Brandy", LocalDate.of(1999, 6, 20),true,false),
                new Person("Alvaro", LocalDate.of(1963, 2, 18),false,true),
                new Person("Maggie", LocalDate.of(2001, 8, 23),true,false),
            };

        Filters[] filters = {Filters.Junior};

        Filter filter = new Filter(persons);

        System.out.println(filter.toString(filter.filter(filters)));
    }
}
