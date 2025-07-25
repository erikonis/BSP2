import java.util.Scanner; 

public class Statistics
{
    public static void main(String[] args) 
    {
        // Initialisation of a Scanner object
        Scanner GetInteger = new Scanner (System.in);


        // Declaration of variables
        int n = 0;          // counter of integer input
        int smallest = 0;   // if i = 0 for the first input, smallest should be 0
        int largest = 0;    // if i = 0 for the first input, largest should be 0
        int sum = 0;        
        double average = 0;


        // Reading a sequence of integer numbers from standard keyboard input
        while ( true )
        {
            System.out.println("Please enter an integer number: ");
            int i = GetInteger.nextInt();
            ++n;              // counter increment after every integer input
            if ( i == 0 )     // termination of reading the sequence by entering 0
            {
                System.out.println("You entered 0 which led to the reading stop of the sequence!");
                System.out.println("------------------------------------------------------------");
                System.out.format("The smallest integer you entered up to now: %d%n", smallest);
                System.out.format("The largest integer you entered up to now: %d%n", largest);
                System.out.format("The average of the entered sequence of integer numbers is: %.2f%n", average);
                break;
            }
            else 
            {   
                if (n == 1)
                {
                    smallest = i; 
                    largest = i;  
                }
                else
                {   
                    smallest = Math.min( i , smallest);
                    largest = Math.max( i , largest);
                }
                sum += i;
                average = sum / (n * 1.0);
            }
        }


        // Closure of the stream
        GetInteger.close();
    }
}