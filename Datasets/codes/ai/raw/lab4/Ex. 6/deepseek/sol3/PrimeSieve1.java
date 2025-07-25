public class PrimeSieve1 {
    public static void main(String[] args) {
        int n = 100;
        boolean[] primes = new boolean[n + 1];
        
        // Initialize all entries as true (except 0 and 1)
        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        // Sieve process
        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    primes[multiple] = false;
                }
            }
        }

        // Print primes in a table
        System.out.println("Primes up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\nTotal primes: " + count);
    }
}