import java.util.ArrayList;
import java.util.List;

public class PrimeSieveList {
    public static void main(String[] args) {
        int limit = 100;
        List<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[limit]; // Track composite numbers

        for (int p = 2; p < limit; p++) {
            if (!isComposite[p]) {
                primes.add(p);
                for (int i = p * p; i < limit; i += p) {
                    isComposite[i] = true;
                }
            }
        }

        System.out.println("Prime Numbers less than " + limit + ":");
        System.out.println("-------------------------------------");
        int count = 0;
        for (int prime : primes) {
            System.out.printf("%-5d", prime);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n-------------------------------------");
        System.out.println("Total number of prime numbers: " + count);
    }
}