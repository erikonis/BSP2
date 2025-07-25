public class PrimeSieve {
    public static void main(String[] args) {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        
        // Initialize all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, else true.
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
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
