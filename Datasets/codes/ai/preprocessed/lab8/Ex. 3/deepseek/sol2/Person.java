import java.util.HashSet;
import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
               Objects.equals(name, person.name) &&
               Objects.equals(email, person.email);
    }

    // Worst possible implementation - constant hash
    @Override
    public int hashCode() {
        return 1; // All objects have same hash
    }

    public static void testPerformance(int size) {
        HashSet<Person> set = new HashSet<>();
        long start = System.currentTimeMillis();

        // Add elements
        for (int i = 0; i < size; i++) {
            set.add(new Person("Name" + i, i, "email" + i + "@test.com"));
        }

        long addTime = System.currentTimeMillis() - start;

        // Contains check
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            set.contains(new Person("Name" + i, i, "email" + i + "@test.com"));
        }

        long containsTime = System.currentTimeMillis() - start;

        System.out.printf("Constant Hash - Size: %,d | Add: %,d ms | Contains: %,d ms%n",
                         size, addTime, containsTime);
    }
}