public class PrimeSieve {
    public static void main(String[] args) {
        Sieve sieve = new Sieve(100);
        sieve.run();
        sieve.displayPrimes();
    }
}

class Sieve {
    private boolean[] isPrime;
    private int limit;

    public Sieve(int limit) {
        this.limit = limit;
        this.isPrime = new boolean[limit];
        for (int i = 2; i < limit; i++) isPrime[i] = true;
    }

    public void run() {
        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    public void displayPrimes() {
        int count = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) System.out.println();
            }
        }
        System.out.println("\n\nTotal primes less than " + limit + ": " + count);
    }
}