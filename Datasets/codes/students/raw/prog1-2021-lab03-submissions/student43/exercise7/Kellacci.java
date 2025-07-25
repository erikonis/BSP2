package lu.uni.programming1.lab3.exercise7;
import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) 
	
{

 Scanner console = new Scanner(System.in);
// Get the count of sequence to print
        System.out.println("Starting number to print: ");
        int imaxno  = console.nextInt();

		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        System.out.print("Fibonacci Series of "+imaxno+" numbers: ");
 
	        for (int i = 1; i <= imaxno; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }

System.out.println(" ");
System.out.println("Kellacci Sequence: ");
int k1 = 1 ;
int k2 = 1 ;
int kprevno1 = 0 ;
int kprevno2 = 0 ;
int knum = 0 ;

for (int j = 3 ; j <= imaxno; ++j)
{
System.out.print(knum+" ");
kprevno1 = k2 - 1;
kprevno2 = k1 * 2 ;
knum = kprevno1 + kprevno2;
k1 = kprevno2;
k2 = knum;

//Kn = (Kn−1 − 1) + (Kn−2 × 2) n > 2

 }
System.out.println(" ");
 
	}
}
