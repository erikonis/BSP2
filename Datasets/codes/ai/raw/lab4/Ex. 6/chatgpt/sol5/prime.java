public class PrimeSieve {
    public static void main(String[] args) {
        boolean[] sieve = new boolean[100];
        java.util.Arrays.fill(sieve, 2, sieve.length, true);

        for (int p = 2; p * p < 100; p++) {
            if (sieve[p]) {
                for (int i = p * p; i < 100; i += p) {
                    sieve[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (sieve[i]) {
                System.out.printf("%4d", i);
                if (++count % 10 == 0) System.out.println();
            }
        }

        System.out.println("\n\nTotal primes less than 100: " + count);
    }
}
