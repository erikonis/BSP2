import java.util.HashSet;
import java.util.Objects;
import java.util.Random;

public class HashCodePerformanceTest {

    // Define a class with some attributes.
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
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyObject myObject = (MyObject) o;
            return id == myObject.id &&
                    Double.compare(myObject.value, value) == 0 &&
                    Objects.equals(name, myObject.name);
        }

        //  Good hashCode() implementation using Objects.hash()
        @Override
        public int hashCode() {
            return Objects.hash(id, name, value);
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Number of elements in the HashSet.
        int[] numElements = {1000, 10000, 100000, 1000000};
        // Number of iterations for the test
        int iterations = 5;

        // Iterate through different numbers of elements.
        for (int n : numElements) {
            System.out.println("\n--- Number of Elements: " + n + " ---");

            // Perform the test multiple times and calculate the average time.
            long totalAddTime = 0;
            long totalContainsTime = 0;

            for (int i = 0; i < iterations; i++) {
                // Create a HashSet.
                HashSet<MyObject> hashSet = new HashSet<>();
                MyObject[] objects = new MyObject[n]; // Store objects for retrieval

                // Generate random objects.
                Random random = new Random();
                for (int j = 0; j < n; j++) {
                    objects[j] = new MyObject(j, "Name" + j, random.nextDouble());
                    hashSet.add(objects[j]);
                }

                // Measure time to add elements.
                long startTime = System.nanoTime();
                for (int j = 0; j < n; j++) {
                    hashSet.add(objects[j]);
                }
                long endTime = System.nanoTime();
                totalAddTime += (endTime - startTime);

                // Measure time to check if elements are contained.
                startTime = System.nanoTime();
                for (int j = 0; j < n; j++) {
                    hashSet.contains(objects[j]);
                }
                endTime = System.nanoTime();
                totalContainsTime += (endTime - startTime);
            }
            double avgAddTimeMillis = (double) totalAddTime / iterations / 1e6;
            double avgContainsTimeMillis = (double) totalContainsTime / iterations / 1e6;

            System.out.println("Average add time: " + avgAddTimeMillis + " ms");
            System.out.println("Average contains time: " + avgContainsTimeMillis + " ms");
        }
    }
}
