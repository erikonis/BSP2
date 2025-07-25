public class PrimeSieveOptimized {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit];
        int primeCount = 0;

        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                // Start marking multiples from p*p
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime Numbers less than " + limit + ":");
        System.out.println("-------------------------------------");
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                System.out.printf("%-5d", i);
                primeCount++;
                if (primeCount % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n-------------------------------------");
        System.out.println("Total number of prime numbers: " + primeCount);
    }
}