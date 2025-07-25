package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;

public class NtoM {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
    // Get Starting Number
            System.out.println("Enter the first integer: ");
            int istartno = console.nextInt();
    // Get Ending Number to Print
            System.out.println("Enter the last integer: ");
            int iendno = console.nextInt();
    // Validate the input received
        if (istartno > iendno)
            System.out.println("Error: Starting Number GT End number of the sequence");
        else
    // Print the Sequence
                for (int num = istartno ; num <= iendno ; num++) {
                System.out.println(" Seq:" + num);
              }
           }
}
