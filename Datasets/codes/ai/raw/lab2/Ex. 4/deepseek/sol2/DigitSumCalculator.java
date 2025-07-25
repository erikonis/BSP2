public class DigitSumCalculator {
    public static int calculateSum(int number) {
        int sum = 0;
        sum += number % 10;        // Units place
        sum += (number / 10) % 10; // Tens place
        sum += (number / 100) % 10; // Hundreds place
        sum += (number / 1000) % 10; // Thousands place
        return sum;
    }
}