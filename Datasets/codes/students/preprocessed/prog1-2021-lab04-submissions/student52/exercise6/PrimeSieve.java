public class PrimeSieve {

    public static void main(String[] args) {
        boolean[] Sieve = new boolean[100];
        int nr = 0;
        for (int i = 2; i < 100; i++)
            Sieve[i] = true;
        int p = 2;
        while (p * p <= 100) {
            if (Sieve[p])
                for (int i = 2 * p; i < 100; i += p)
                    Sieve[i] = false;
            p++;
        }
        for (int i = 2; i < 100; i++)
            if (Sieve[i]) {
                System.out.print(i + " ");
                nr++;
            }
        System.out.println("nr of primes:" + nr);

    }

}