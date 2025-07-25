import java.util.Scanner;

public class NtoM
{
    public static void main(String[] args) 
    {
        // Initialisation of a Scanner object
        Scanner GetInteger = new Scanner (System.in);

        // Reading the integer numbers n and m from standard keyboard input
        System.out.println("Please enter an integer value for n : ");
        int n = GetInteger.nextInt();

        System.out.println("Please enter an integer value for m >= n : ");
        int m = GetInteger.nextInt();

        // Sanity check and resolution by variables swap, if user disregarded the request prompt
        if (n > m) 
        {
            int temp = n;
            n = m;
            m = temp;
            System.out.println("Integers n and m were swapped since you entered n , m such that n > m!");
        }

        System.out.println("-----------------");
        // Integer counting from n to m with for-loop and console output
        for (int i = n ; i <= m ; i++)
        {
            System.out.println(i);
        }

        // Closure of stream
        GetInteger.close();

        // 20 lines, comments included
    }    
}
