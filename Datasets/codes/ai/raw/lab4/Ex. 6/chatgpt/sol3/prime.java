public class PrimeSieve {
    public static void main(String[] args) {
        boolean[] primes = generateSieve(100);
        printPrimes(primes);
    }

    static boolean[] generateSieve(int limit) {
        boolean[] isPrime = new boolean[limit];
        for (int i = 2; i < limit; i++) isPrime[i] = true;

        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

    static void printPrimes(boolean[] isPrime) {
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\n\nTotal primes less than " + isPrime.length + ": " + count);
    }
}
