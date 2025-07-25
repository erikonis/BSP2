import java.util.*;
import java.util.function.BiFunction;

public class HashCodeExperiment {

    public static class DataItem {
        int id;
        String name;
        BiFunction<Integer, String, Integer> hashFunction;

        public DataItem(int id, String name, BiFunction<Integer, String, Integer> hashFunction) {
            this.id = id;
            this.name = name;
            this.hashFunction = hashFunction;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof DataItem other)) return false;
            return id == other.id && Objects.equals(name, other.name);
        }

        @Override
        public int hashCode() {
            return hashFunction.apply(id, name);
        }
    }

    public static void testPerformance(String label, BiFunction<Integer, String, Integer> hashFunc, int count) {
        System.out.println("\n--- Testing " + label + " ---");

        Set<DataItem> set = new HashSet<>();
        long insertStart = System.nanoTime();
        for (int i = 0; i < count; i++) {
            set.add(new DataItem(i, "Item" + i, hashFunc));
        }
        long insertEnd = System.nanoTime();

        long lookupStart = System.nanoTime();
        for (int i = 0; i < count; i++) {
            set.contains(new DataItem(i, "Item" + i, hashFunc));
        }
        long lookupEnd = System.nanoTime();

        System.out.printf("Insert Time: %.2f ms%n", (insertEnd - insertStart) / 1e6);
        System.out.printf("Lookup Time: %.2f ms%n", (lookupEnd - lookupStart) / 1e6);
    }

    public static void main(String[] args) {
        int size = 100_000;

        // Very bad hash: constant
        testPerformance("Constant Hash", (id, name) -> 1, size);

        // Only ID
        testPerformance("ID Only Hash", (id, name) -> Integer.hashCode(id), size);

        // Full good hash
        testPerformance("Good Hash (ID + Name)", (id, name) -> Objects.hash(id, name), size);

        // Slight variation
        testPerformance("Custom Weighted Hash", (id, name) -> id * 31 + name.length(), size);
    }
}