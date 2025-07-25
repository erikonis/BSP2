import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        
        int largest;
        int smallest;
        double average =0;
        int current;
        int counter=0;
        int sum=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please put in a number: ");
        current = scanner.nextInt();
        largest = current;
        smallest = current;
        sum = sum + current;
        counter++;

        while(current != 0)
        {
            if(current < smallest)
            {
                smallest = current;
            }
            else if(current > largest)
            {
                largest = current;
            }
            sum = sum + current;
            counter++;

            System.out.println("Please put in a number: ");
            current = scanner.nextInt();
        }
        scanner.close();

        average = (double)sum/counter;

        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        System.out.println("The average is: " + average);
    }
}
