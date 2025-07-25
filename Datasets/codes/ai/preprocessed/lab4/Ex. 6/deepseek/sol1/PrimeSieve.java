public class PrimeSieve {
    public static void main(String[] args) {
        boolean[] isPrime = new boolean[101];
        for (int i = 2; i <= 100; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= 100; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= 100; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to 100:");
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime[i]) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\nTotal prime numbers: " + count);
    }
}