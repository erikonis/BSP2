import java.util.BitSet;

public class PrimeSieveBitSet {
    public static void main(String[] args) {
        int limit = 100;
        BitSet isPrime = new BitSet(limit);
        int primeCount = 0;

        // Initially set all numbers (except 0 and 1) as potentially prime
        for (int i = 2; i < limit; i++) {
            isPrime.set(i);
        }

        for (int p = 2; p * p < limit; p++) {
            if (isPrime.get(p)) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime.clear(i);
                }
            }
        }

        System.out.println("Prime Numbers less than " + limit + ":");
        System.out.println("-------------------------------------");
        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime.get(i)) {
                System.out.printf("%-5d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n-------------------------------------");
        System.out.println("Total number of prime numbers: " + count);
    }
}