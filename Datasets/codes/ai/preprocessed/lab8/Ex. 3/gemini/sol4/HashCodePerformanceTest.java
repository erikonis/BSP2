import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class HashCodePerformanceTest {

    // Define a class with attributes.
    static class MyObject {
        private int id;
        private String name;
        private double value;

        public MyObject(int id, String name, double value) {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getValue() {
            return value;
        }

        // Properly implemented equals method.
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            MyObject myObject = (MyObject) o;
            return id == myObject.id && Double.compare(myObject.value, value) == 0 && Objects.equals(name, myObject.name);
        }

        // Good hashCode() implementation using Objects.hash().
        @Override
        public int hashCode() {
            return Objects.hash(id, name, value);
        }

        @Override
        public String toString() {
            return "MyObject{" + "id=" + id + ", name='" + name + '\'' + ", value=" + value + '}';
        }
    }

    public static void main(String[] args) {
        // Define the number of elements to test.
        int[] numElements = { 1000, 10000, 100000, 1000000 };
        // Define the number of iterations for each test.
        int iterations = 5;

        // Iterate over the different numbers of elements.
        for (int numElementsToTest : numElements) {
            System.out.println("\n--- Testing with " + numElementsToTest + " elements ---");
            runHashSetPerformanceTest(numElementsToTest, iterations);
        }
    }

    // Method to run the HashSet performance test.
    private static void runHashSetPerformanceTest(int numElements, int iterations) {
        long totalAddTime = 0;
        long totalContainsTime = 0;
        Random random = new Random();

        for (int iteration = 0; iteration < iterations; iteration++) {
            HashSet<MyObject> hashSet = new HashSet<>();
            MyObject[] testObjects = new MyObject[numElements];

            // Generate test data.
            for (int i = 0; i < numElements; i++) {
                testObjects[i] = new MyObject(i, "Name" + i, random.nextDouble());
                hashSet.add(testObjects[i]);
            }

            // Measure add time.
            long startTime = System.nanoTime();
            for (MyObject obj : testObjects) {
                hashSet.add(obj);
            }
            long endTime = System.nanoTime();
            totalAddTime += (endTime - startTime);

            // Measure contains time.
            startTime = System.nanoTime();
            for (MyObject obj : testObjects) {
                hashSet.contains(obj);
            }
            endTime = System.nanoTime();
            totalContainsTime += (endTime - startTime);
        }

        // Calculate and print the results.
        double averageAddTimeMillis = (double) totalAddTime / iterations / 1e6;
        double averageContainsTimeMillis = (double) totalContainsTime / iterations / 1e6;

        System.out.println("Average add time: " + String.format("%.4f", averageAddTimeMillis) + " ms");
        System.out.println("Average contains time: " + String.format("%.4f", averageContainsTimeMillis) + " ms");
    }
}