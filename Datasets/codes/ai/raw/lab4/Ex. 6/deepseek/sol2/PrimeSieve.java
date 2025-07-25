public class PrimeSieve {
    public static void main(String[] args) {
        final int SIZE = 100;
        boolean[] isPrime = new boolean[SIZE + 1]; // indices 0-100
        
        // Step 1: Initialize all elements to true (except 0 and 1)
        for (int i = 2; i <= SIZE; i++) {
            isPrime[i] = true;
        }
        
        // Steps 2-5: Sieve algorithm
        for (int p = 2; p * p <= SIZE; p++) {
            if (isPrime[p]) {
                // Mark all multiples of p as non-prime
                for (int multiple = p * p; multiple <= SIZE; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }
        
        // Step 6: Output the results
        System.out.println("Prime numbers less than or equal to " + SIZE + ":");
        System.out.println("--------------------------------------------");
        
        int count = 0;
        int numbersPerLine = 10;
        
        for (int i = 2; i <= SIZE; i++) {
            if (isPrime[i]) {
                System.out.printf("%4d", i);
                count++;
                
                // New line after every numbersPerLine primes
                if (count % numbersPerLine == 0) {
                    System.out.println();
                }
            }
        }
        
        // Add a newline if the last line wasn't complete
        if (count % numbersPerLine != 0) {
            System.out.println();
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("Total prime numbers less than or equal to " + SIZE + ": " + count);
    }
}