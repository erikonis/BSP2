package ex4;

import java.util.Scanner;

public class DivThreeCeptionString {
    public static void main(Stringargs) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long value: ");
        long number = input.nextLong();

        String numStr = String.valueOf(number);
        while (numStr.length() > 1) {
            long sum = 0;
            for (char c : numStr.toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            numStr = String.valueOf(sum);
        }

        int finalDigit = Integer.parseInt(numStr);
        switch (finalDigit) {
            case 0:
            case 3:
            case 6:
            case 9:
                System.out.println(number + " is divisible by 3");
                break;
            default:
                System.out.println(number + " is not divisible by 3");
        }
    }
}