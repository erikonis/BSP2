import java.util.BitSet;

public class PrimeSieve {
    public static void main(String[] args) {
        int n = 100;
        BitSet isPrime = new BitSet(n + 1);
        isPrime.set(2, n + 1); // Set all bits from 2 to n to true

        for (int p = 2; p * p <= n; p++) {
            if (isPrime.get(p)) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime.clear(i);
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime.get(i)) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal number of prime numbers less than " + n + ": " + count);
    }
}
