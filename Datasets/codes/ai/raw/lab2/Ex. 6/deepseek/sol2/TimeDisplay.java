import java.util.Scanner;

public class TimeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read hours
        System.out.print("Enter hours (0-23): ");
        int hours = scanner.nextInt();
        if (hours < 0 || hours > 23) {
            System.out.println("Invalid hours. Please enter a value between 0 and 23.");
            return;
        }

        // Read minutes
        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();
        if (minutes < 0 || minutes > 59) {
            System.out.println("Invalid minutes. Please enter a value between 0 and 59.");
            return;
        }

        // Read seconds
        System.out.print("Enter seconds (0-59): ");
        int seconds = scanner.nextInt();
        if (seconds < 0 || seconds > 59) {
            System.out.println("Invalid seconds. Please enter a value between 0 and 59.");
            return;
        }

        // Display the time in hh:mm:ss format
        System.out.printf("Time entered: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}