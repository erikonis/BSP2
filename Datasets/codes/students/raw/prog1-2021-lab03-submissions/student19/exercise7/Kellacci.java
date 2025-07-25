package lu.uni.programming1.lab3.exercise7;

import java.util.Scanner;

public class Kellacci
{
    public static void main(String[] args) 
    {
        // Initialisation of a Scanner object
        Scanner GetInteger = new Scanner (System.in);


        // Reading an integer number n from standard keyboard input
        System.out.println
        ("Please enter an integer n > 0 to output the famous Kellacci sequence up to the n-th term: ");
        int n = GetInteger.nextInt();
        System.out.println("------------------------------------------------------------------------");

        // Output method based on loops, not on recursion!
        long k = 1;   // long type is recommended as the sequence is growing fast!
        System.out.format("Below are the Kellacci sequence terms up to the %d-th term: %n", n);

        for ( int i = 1 ; i <= n ; i++ ) // integer variable i corresponding to index in the sequence
        {   
            System.out.format("Index %d :      K = %d%n", i , k);
            if ( i % 2 == 1 )
            {
                k = (k * 2)-1;
            }
            else 
            {
                k = k * 2;
            }
        }
        

        // Closure of the stream
        GetInteger.close();
    }    
}
