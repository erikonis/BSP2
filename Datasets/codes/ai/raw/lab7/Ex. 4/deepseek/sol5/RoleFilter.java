public class RoleFilter {
    public static Filter lecturer() {
        return people -> filter(people, p -> p.teaches() && !p.studies());
    }
    
    public static Filter student() {
        return people -> filter(people, p -> p.studies() && !p.teaches());
    }
    
    public static Filter ta() {
        return people -> filter(people, p -> p.studies() && p.teaches());
    }
    
    private static Person[] filter(Person[] people, java.util.function.Predicate<Person> condition) {
        Person[] result = new Person[people.length];
        int count = 0;
        for (Person p : people) {
            if (p != null && condition.test(p)) {
                result[count++] = p;
            }
        }
        return compact(result, count);
    }
    
    private static Person[] compact(Person[] array, int count) {
        Person[] compact = new Person[count];
        System.arraycopy(array, 0, compact, 0, count);
        return compact;
    }
}