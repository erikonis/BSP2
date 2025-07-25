public class SieveEratosthenes {

    public static void main(String[] args) {
        // initialize sieve
        boolean sieve[] = new boolean[100];
        for (int i = 2; i < sieve.length; i++) {
            sieve[i] = true;
        }

        // sieve
        int p = 2;
        while (p * p <= sieve.length) {

            // set multiples of p (excluding p) to false
            for (int i = 2; i * p < sieve.length; i++) {
                sieve[i * p] = false;
            }

            // search for next p
            for (p = p + 1; !sieve[p]; p++) {
            }
        }

        // print sieve
        int count = 0;
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) {
                System.out.print(String.format("%2d\t", i));
                count++;
            } else {
                System.out.print("\t");
            }

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nNumber of prime numbers less than " + sieve.length + ": " + count);
    }
}