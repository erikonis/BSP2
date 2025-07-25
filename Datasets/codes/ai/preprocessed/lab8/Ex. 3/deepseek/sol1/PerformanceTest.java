import java.util.HashSet;

public class PerformanceTest {
    public static void main(String[] args) {
        int numElements = 100000; // Number of elements to test
        HashSet<MyClass> set = new HashSet<>();

        // Test adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            set.add(new MyClass(i, "Name" + i));
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add " + numElements + " elements: " + (endTime - startTime) / 1_000_000 + " ms");

        // Test retrieving elements
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            set.contains(new MyClass(i, "Name" + i));
        }
        endTime = System.nanoTime();
        System.out.println("Time to retrieve " + numElements + " elements: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}