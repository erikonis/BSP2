import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, small, large, numberAmount;
        double average, sum; // sum here because we divide 2 integers later on an we want the decimal value

        System.out.println("Please enter a sequence of integers. If you type '0', the sequence will end.");
        number = scanner.nextInt();
        small = number;
        large = number;
        sum = number;
        numberAmount = 1;
        while (number != 0) {
            number = scanner.nextInt();
            if (number != 0) {
                small = Math.min(small, number);
                large = Math.max(large, number);
                sum += number;
                numberAmount += 1;
            }
        }
        average = sum / numberAmount;
        System.out.printf("smallest number = %d \nlargest number = %d \naverage = %.2f", small, large, average);

        scanner.close();
    }
}
