import java.util.*;

public class CustomHashCode {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person p = (Person) o;
            return age == p.age && name.equals(p.name);
        }

        public int hashCode() {
            int result = 17;
            result = 31 * result + name.hashCode();
            result = 31 * result + age;
            return result;
        }
    }

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        int count = 100_000;
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            set.add(new Person("Person" + i, i));
        }
        long mid = System.nanoTime();
        for (Person p : set) {
            set.contains(p);
        }
        long end = System.nanoTime();
        System.out.println("CustomHashCode:");
        System.out.println("Insert time: " + (mid - start)/1_000_000 + " ms");
        System.out.println("Lookup time: " + (end - mid)/1_000_000 + " ms");
    }
}