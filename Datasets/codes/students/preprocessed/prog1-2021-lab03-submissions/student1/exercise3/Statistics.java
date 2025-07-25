import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 1;
        int smallestNumber = 99999;
        int largestNumber = 1;
        double average = 0;

        do{
            System.out.println("Please, write a sequence of numbers: ");
            x = scanner.nextInt();
            scanner.nextLine();

            if (x > largestNumber){
               largestNumber = x;
            
            }else{
                if ( x < smallestNumber && x!=0){
                    smallestNumber = x;
                }
            }
        } while( x != 0);
             System.out.println("This is the smallest number: "+smallestNumber);
             System.out.println("This is the largest number: "+largestNumber);

             average = (smallestNumber + largestNumber) / 2;
             System.out.println("This is the average of these numbers: "+average);
    
        scanner.close();
    }
}
