import java.util.Scanner;

public class TimeAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter time format
        System.out.print("Enter time format (12-hour or 24-hour): ");
        String format = scanner.nextLine().toLowerCase();

        // Validate format
        if (!format.equals("12-hour") && !format.equals("24-hour")) {
            System.out.println("Invalid format. Please enter '12-hour' or '24-hour'.");
            return;
        }

        // Prompt user to input hours, minutes, and seconds
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();

        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();

        System.out.print("Enter second: ");
        int second = scanner.nextInt();

        // Validate hours, minutes, and seconds
        if (minute < 0 || minute > 59) {
            System.out.println("Invalid minute value. Must be between 0 and 59.");
            return;
        }

        if (second < 0 || second > 59) {
            System.out.println("Invalid second value. Must be between 0 and 59.");
            return;
        }

        if (format.equals("12-hour")) {
            if (hour < 1 || hour > 12) {
                System.out.println("Invalid hour for 12-hour format. Must be between 1 and 12.");
                return;
            }
        } else if (format.equals("24-hour")) {
            if (hour < 0 || hour > 23) {
                System.out.println("Invalid hour for 24-hour format. Must be between 0 and 23.");
                return;
            }
        }

        // Display original time in hh:mm:ss format with leading zeros
        System.out.printf("Original Time: %02d:%02d:%02d\n", hour, minute, second);

        // Advance the time by 5 seconds
        second += 5;

        // Handle overflow of seconds
        if (second >= 60) {
            second -= 60;
            minute += 1;
        }

        // Handle overflow of minutes
        if (minute >= 60) {
            minute -= 60;
            hour += 1;
        }

        // Handle overflow of hours for 12-hour and 24-hour clocks
        if (hour >= 24) {
            hour -= 24;
        } else if (hour >= 13 && format.equals("12-hour")) {
            hour = 1;
        }

        // Display the new time in hh:mm:ss format with leading zeros
        System.out.printf("New Time: %02d:%02d:%02d\n", hour, minute, second);
    }
}