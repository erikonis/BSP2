import java.time.LocalTime;
import java.util.Scanner;

public class TimeAdvanceLocalTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read hours
        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();

        // Read minutes
        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        // Read seconds
        System.out.print("Enter seconds (0-59): ");
        int seconds = scanner.nextInt();

        // Create LocalTime object
        LocalTime time = LocalTime.of(hours, minutes, seconds);

        // Display the original time
        System.out.println("Original time: " + time);

        // Advance time by 5 seconds
        time = time.plusSeconds(5);

        // Display the new time
        System.out.println("New time: " + time);
    }
}