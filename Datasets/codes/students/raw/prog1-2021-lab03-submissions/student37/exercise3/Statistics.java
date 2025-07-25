package lu.uni.programming1.lab3.exercise3;
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an interger value or 0 to stop: ");
        int n = scanner.nextInt();
        double sum = 0, average = 0, min = 0, max = 0;
        int count = 0;

        while (n != 0) {
            
            sum += n;
            count++;
            average = (sum/count);
            if(min < n && min != 0){ min = min;} else{min = n;}
            if(max > n){ max = max;}else{max = n;}
            System.out.print("Please enter an interger value or 0 to stop: ");
            n = scanner.nextInt();
        }  
        System.out.println("The smallest number was: " + min + "\nThe largest number was: " + max + "\nThe average is: " + String.format( "%.2f", average));
        
        scanner.close();  
    }
        
}
