import java.util.Scanner;

public class XtoY 
{
    public static void main(String[] args) 
    {
        // Initialisation of a Scanner object
        Scanner GetDecimal = new Scanner (System.in);

        // Reading the decimal numbers x , y , d from standard keyboard input 
        System.out.println("Please enter a decimal number x :");
        double x = GetDecimal.nextDouble();

        System.out.println("Please enter a decimal number y >= x :");
        double y = GetDecimal.nextDouble();

        System.out.println("Please enter a decimal number d > 0 :");
        double d = GetDecimal.nextDouble();

        // Sanity check and resolution by variables swap between x , y / sign change of d for erroneous input
        if (x > y)
            {
                double temp = y;
                y = x;
                x = temp;
                System.out.println("Decimals x and y were swapped since you entered x , y such that x > y !");
            }
        if (d < 0)
            {
                d = - d;
                System.out.println("The absolute value of d was taken, as steps d are d > 0!");
            }    

        System.out.println("-------------------");
        
        // Console output of decimal numbers from x to y in steps of d
        for (double i = x ; i <= y ; i += d)
            {
                System.out.format("%.1f%n", i); // %.1f is used here as format uses the "round half up"-rule
            }
        if ( (y - x) % d != 0 ) 
            {// Outputs y, when y cannot be reached by multiple steps of d from x
             // works for "big enough" differences between last iteration value in the for-loop and y
                System.out.format("%.1f%n", y); 
            }

        // Closure of stream
        GetDecimal.close();

        // 29 lines of code, comments included
    }   
}
