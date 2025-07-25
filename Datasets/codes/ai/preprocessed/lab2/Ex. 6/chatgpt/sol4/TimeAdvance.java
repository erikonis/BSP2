import java.util.Scanner;

public class TimeAdvance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the time format
        System.out.print("Enter time format (12-hour or 24-hour): ");
        String format = scanner.nextLine().toLowerCase();

        // Validate time format
        if (!TimeValidator.isValidFormat(format)) {
            System.out.println("Invalid format. Please enter '12-hour' or '24-hour'.");
            return;
        }

        // Prompt the user to enter the hour, minute, and second
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();

        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();

        System.out.print("Enter second: ");
        int second = scanner.nextInt();

        // Validate the input
        if (!TimeValidator.isValidHour(hour, format)) {
            System.out.println("Invalid hour value.");
            return;
        }

        if (!TimeValidator.isValidMinute(minute)) {
            System.out.println("Invalid minute value.");
            return;
        }

        if (!TimeValidator.isValidSecond(second)) {
            System.out.println("Invalid second value.");
            return;
        }

        // Display original time
        System.out.println("Original Time: " + TimeFormatter.formatTime(hour, minute, second));

        // Create an array to store hour, minute, and second for easy modification
        int[] time = {hour, minute, second};

        // Advance the time by 5 seconds
        TimeFormatter.advanceTime(time);

        // Display the new time
        System.out.println("New Time: " + TimeFormatter.formatTime(time[0], time[1], time[2]));
    }
}