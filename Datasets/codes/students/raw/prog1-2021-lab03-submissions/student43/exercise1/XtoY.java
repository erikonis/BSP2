package lu.uni.programming1.lab3.exercise1;
import java.util.Scanner;

public class XtoY {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
    // Get Starting Number
            System.out.println("Starting Number to Print: ");
            int istartno = console.nextInt();
    // Get Ending Number to Print
            System.out.println("Until What Number to Print: ");
            int iendno = console.nextInt();
    // Get Number to Setp
            System.out.println("Until What Number to Print: ");
            double istep = console.nextDouble();
        double num = 0;
    
    // Validate the input received
        if (istartno > iendno)
            System.out.println("Error : Starting Number GT End number of the sequence");
        else
    // Print the Sequence
                for (num = istartno ; num <= iendno ; num += istep) {
                System.out.println(" Seq :" + num);
              }
           }
}
