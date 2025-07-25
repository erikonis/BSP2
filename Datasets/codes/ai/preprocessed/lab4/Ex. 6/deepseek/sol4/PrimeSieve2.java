public class PrimeSieve2 {
    public static void main(String[] args) {
        int n = 100;
        int size = (n + 1) / 2; // Only store odd numbers (2 is handled separately)
        boolean[] sieve = new boolean[size];

        // Initialize all odd numbers as potential primes
        for (int i = 1; i < size; i++) {
            sieve[i] = true;
        }

        // Sieve process for odd numbers
        for (int i = 1; i < size; i++) {
            if (sieve[i]) {
                int p = 2 * i + 1;
                for (int multiple = p * p; multiple <= n; multiple += 2 * p) {
                    int idx = (multiple - 1) / 2;
                    if (idx < size) sieve[idx] = false;
                }
            }
        }

        // Print primes (2 + odd primes)
        System.out.println("Primes up to " + n + ":");
        System.out.printf("%4d", 2);
        int count = 1;
        for (int i = 1; i < size; i++) {
            if (sieve[i]) {
                System.out.printf("%4d", 2 * i + 1);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\nTotal primes: " + count);
    }
}