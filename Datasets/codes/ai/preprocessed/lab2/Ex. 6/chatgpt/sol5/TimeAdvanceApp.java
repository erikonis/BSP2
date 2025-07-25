import java.util.Scanner;

public class TimeAdvanceApp {
    public static void main(String[] args) {
        TimeInputHandler inputHandler = new TimeInputHandler();
        Scanner scanner = new Scanner(System.in);

        // Get time format and validate
        String format = inputHandler.getTimeFormat();
        if (!TimeValidator.isValidFormat(format)) {
            System.out.println("Invalid format. Please enter '12-hour' or '24-hour'.");
            return;
        }

        // Get and validate the hour, minute, second input
        int hour = inputHandler.getHour();
        if (!TimeValidator.isValidHour(hour, format)) {
            System.out.println("Invalid hour. Please enter a valid hour based on the format.");
            return;
        }

        int minute = inputHandler.getMinute();
        if (!TimeValidator.isValidMinute(minute)) {
            System.out.println("Invalid minute. Please enter a valid minute.");
            return;
        }

        int second = inputHandler.getSecond();
        if (!TimeValidator.isValidSecond(second)) {
            System.out.println("Invalid second. Please enter a valid second.");
            return;
        }

        // Format and display original time
        System.out.println("Original Time: " + TimeOperations.formatTime(hour, minute, second));

        // Advance the time by 5 seconds
        int[] updatedTime = TimeOperations.advanceTime(hour, minute, second);

        // Format and display the new time
        System.out.println("New Time: " + TimeOperations.formatTime(updatedTime[0], updatedTime[1], updatedTime[2]));
    }
}