import java.util.Scanner;

public class DivThreeCeption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        int result = DigitUtils.digitCollapse(number);

        System.out.println("Collapsed digit: " + result);

        switch (result) {
            case 3, 6, 9 -> System.out.println("Divisible by 3!");
            default -> System.out.println("Not divisible by 3.");
        }
    }
}

class DigitUtils {
    public static int digitCollapse(String number) {
        int sum;
        do {
            sum = 0;
            for (char c : number.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += c - '0';
                }
            }
            number = Integer.toString(sum);
        } while (sum >= 10);
        return sum;
    }
}