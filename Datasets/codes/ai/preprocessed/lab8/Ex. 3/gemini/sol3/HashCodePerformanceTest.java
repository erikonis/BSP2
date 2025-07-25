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

        // Good hashCode() implementation using Objects.hash().  This is the one we'll use.
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
        // Define the number of elements to test with.
        int[] numElements = { 1000, 10000, 100000, 1000000 };
        // Define the number of iterations for each test.  More iterations give more accurate results.
        int iterations = 5;

        // Iterate over the different numbers of elements.
        for (int numElementsToTest : numElements) {
            System.out.println("\n--- Testing with " + numElementsToTest + " elements ---");

            long totalAddTime = 0;      // To accumulate add times across iterations.
            long totalContainsTime = 0;  // To accumulate contains times.
            Random random = new Random(); // Use a single Random instance.

            // Run the test 'iterations' times to get an average.
            for (int iteration = 0; iteration < iterations; iteration++) {
                // 1. Create a HashSet to store our objects.
                HashSet<MyObject> hashSet = new HashSet<>();

                // 2. Create an array to hold the objects we'll add.  This is important
                //    so we can later retrieve them in the 'contains' test.
                MyObject[] testObjects = new MyObject[numElementsToTest];

                // 3. Generate the objects and add them to the HashSet.
                for (int i = 0; i < numElementsToTest; i++) {
                    testObjects[i] = new MyObject(i, "Name" + i, random.nextDouble()); // Create a new object.
                    hashSet.add(testObjects[i]); // Add it to the HashSet.
                }

                // 4. Measure the time it takes to add all the elements.
                long startTime = System.nanoTime();
                for (MyObject obj : testObjects) { // Iterate over the array.
                    hashSet.add(obj);
                }
                long endTime = System.nanoTime();
                totalAddTime += (endTime - startTime); // Add the time to the total.

                // 5. Measure the time it takes to check if the elements are in the HashSet.
                startTime = System.nanoTime();
                for (MyObject obj : testObjects) {
                    hashSet.contains(obj); // Check if each object is in the HashSet.
                }
                endTime = System.nanoTime();
                totalContainsTime += (endTime - startTime);
            }

            // 6. Calculate the average times in milliseconds.
            double averageAddTimeMillis = (double) totalAddTime / iterations / 1e6;
            double averageContainsTimeMillis = (double) totalContainsTime / iterations / 1e6;

            // 7. Print the results.
            System.out.println("Average add time: " + String.format("%.4f", averageAddTimeMillis) + " ms");
            System.out.println("Average contains time: " + String.format("%.4f", averageContainsTimeMillis) + " ms");
        }
    }
}