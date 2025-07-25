import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        int min;
        int max;
        int sum;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value(enter 0 to stop program): ");
        sum = min = max = scanner.nextInt();
        counter++;
        while(true){
            System.out.print("Enter a value(enter 0 to stop program): ");
            int m = scanner.nextInt();
            if(m == 0){
                break;
            }
            if(m < min){
                min = m;
            }
            if(m > max){
                max = m;
            }
            sum += m;
            counter++;
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Biggest number: " + max);
        double average = (double) sum/counter;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
