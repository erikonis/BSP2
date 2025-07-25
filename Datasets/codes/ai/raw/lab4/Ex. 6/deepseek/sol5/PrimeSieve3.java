import java.util.BitSet;
import java.util.stream.IntStream;

public class PrimeSieve3 {
    public static void main(String[] args) {
        int n = 100;
        BitSet primes = new BitSet(n + 1);
        primes.set(2, n + 1); // Initially mark all numbers >= 2 as potential primes

        // Sieve process using streams
        IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .filter(p -> primes.get(p))
                .forEach(p -> {
                    for (int multiple = p * p; multiple <= n; multiple += p) {
                        primes.clear(multiple);
                    }
                });

        // Print primes in a table
        System.out.println("Primes up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primes.get(i)) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\nTotal primes: " + count);
    }
}