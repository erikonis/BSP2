package ex6;

public class PrimeSieve {

    public static void main(Stringargs) {
        booleanisPrime = new boolean[100];
        for (int i = 2; i < 100; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < 100; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < 100; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers less than 100:");
        int count = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrime[i]) {
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers: " + count);
    }
}