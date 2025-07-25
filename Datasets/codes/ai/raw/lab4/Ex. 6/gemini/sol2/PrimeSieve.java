public class PrimeSieve {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit];
        int primeCount = 0;

        // Initialize all numbers as potentially prime
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        for (int p = 2; p * p < limit; p++) {
            // If p is prime, mark all its multiples as not prime
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Count and print the prime numbers in a table format
        System.out.println("Prime Numbers less than " + limit + ":");
        System.out.println("-------------------------------------");
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                System.out.printf("%-5d", i);
                primeCount++;
                if (primeCount % 10 == 0) {
                    System.out.println(); // New line after every 10 primes
                }
            }
        }
        System.out.println("\n-------------------------------------");
        System.out.println("Total number of prime numbers: " + primeCount);
    }
}