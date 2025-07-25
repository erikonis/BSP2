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

            long totalAddTime = 0;
            long totalContainsTime = 0;
            Random random = new Random();

            for (int iteration = 0; iteration < iterations; iteration++) {
                HashSet<MyObject> hashSet = new HashSet<>();
                MyObject[] testObjects = new MyObject[numElementsToTest];

                // Generate and add data
                for (int i = 0; i < numElementsToTest; i++) {
                    hashSet.add(testObjects[i] = new MyObject(i, "Name" + i, random.nextDouble()));
                }

                // Measure add and contains time
                long startTime = System.nanoTime();
                for (MyObject obj : testObjects)  hashSet.add(obj);
                totalAddTime += (System.nanoTime() - startTime);

                startTime = System.nanoTime();
                for (MyObject obj : testObjects) hashSet.contains(obj);
                totalContainsTime += (System.nanoTime() - startTime);
            }

            // Output
            System.out.println("Average add time: " + String.format("%.4f", (double) totalAddTime / iterations / 1e6) + " ms");
            System.out.println("Average contains time: " + String.format("%.4f", (double) totalContainsTime / iterations / 1e6) + " ms");
        }
    }
}
