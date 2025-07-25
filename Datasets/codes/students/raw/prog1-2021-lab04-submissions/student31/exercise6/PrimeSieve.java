package lu.uni.programming1.lab4.exercise6;

public class PrimeSieve {
    public static void main(String[] args) {
        boolean arr[];
        arr = new boolean[100];

        //sets every value to true 
        for (int i = 0; i < 100; i++) {
            arr[i] = true;
        }

        int p = 2;

        do {
            if (arr[p]) {
            //sets index of arr[]'s values' indexes to false if their are divisible by p
                for (int i = 0; i < 100; i++) {
                    if (i % p == 0 && i > p) {
                        arr[i] = false;
                    }
                }
            }
            p += 1;
        } while (p*p <= 100);

        String prime = "\nThe prime number less than 100 are:\n";

        //outputs remaining values as table
        for (int i = 0; i < 100; i++) {
            System.out.format("%2d  %b %n", i, arr[i]);
            //collects prime numbers
            if (arr[i]) {
                prime += (i + "\n");
            }
        }
        
        //outputs the prime numbers
        System.out.println(prime);
    }
}
