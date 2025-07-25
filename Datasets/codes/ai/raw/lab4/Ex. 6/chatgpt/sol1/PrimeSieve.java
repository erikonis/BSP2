package lab04.Others.chatgpt;

public // PrimeSieve.java
public class PrimeSieve {
    public static void main(String[] args) {
        int limit = 100;
        boolean[] primes = new boolean[limit + 1];
        for (int i = 0; i <= limit; i++) {
            primes[i] = true;
        }

        primes[0] = primes[1] = false; // 0 and 1 are not prime

        for (int p = 2; p * p <= limit; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    primes[i] = false;
                }
            }
        }

        System.out.println("Prime numbers less than " + limit + ":");
        int count = 0;
        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers: " + count);
    }
}
 {
    
}
