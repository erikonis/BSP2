import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int numElements = 100000;
        HashSet<Person> set = new HashSet<>();

        // Measure time for adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            set.add(new Person("Name" + i, i));
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add elements: " + (endTime - startTime) + " ns");

        // Measure time for retrieving elements
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            set.contains(new Person("Name" + i, i));
        }
        endTime = System.nanoTime();
        System.out.println("Time to retrieve elements: " + (endTime - startTime) + " ns");
    }
}
