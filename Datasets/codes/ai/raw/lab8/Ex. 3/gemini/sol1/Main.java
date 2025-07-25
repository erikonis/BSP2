import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        testPerformance(10000);
        testPerformance(100000);
        testPerformance(1000000);
    }

    private static void testPerformance(int size) {
        Set<MyObject> set = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            set.add(new MyObject("Name" + i, i));
        }
        long endTime = System.nanoTime();
        System.out.println("Adding " + size + " elements (Constant hashCode): " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            set.contains(new MyObject("Name" + i, i));
        }
        endTime = System.nanoTime();
        System.out.println("Retrieving " + size + " elements (Constant hashCode): " + (endTime - startTime) + " ns");

    }
}