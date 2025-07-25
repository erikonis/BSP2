package exercise6;

public class PrimeSieve {
    public static void main(String[] args) {
        boolean[] primes = new boolean[100];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < primes.length; p++) {
            if (primes[p]) {
                for (int i = p * p; i < primes.length; i += p) {
                    primes[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to 100:");
        int count = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal number of prime numbers less than 100: " + count);
    }
}