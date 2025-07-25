import java.util.HashSet;
import java.util.Set;

public class PrimeSieve {
    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        Set<Integer> primes = new HashSet<>();

        // Initialize all entries as true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Collect all prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int prime : primes) {
            System.out.printf("%4d", prime);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nTotal number of prime numbers less than " + n + ": " + count);
    }
}