public class PeopleFilter {
    public static Person[] filter(Person[] people, Filter filter) {
        return filter.apply(people);
    }

    public static void print(Person[] people, String title) {
        System.out.println("\n" + title + ":");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}