import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        System.out.print("Enter format (12 or 24): ");
        int format = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String period = "";
        if (format == 12) {
            System.out.print("Enter AM or PM: ");
            period = scanner.nextLine().toUpperCase();
        }

        // Sanity checks
        if (hours < 0 || hours >= (format == 12 ? 12 : 24) || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            System.out.println("Invalid time input.");
            return;
        }

        Time time = new Time(hours, minutes, seconds, format, period);

        // Display the indicated time
        System.out.println("Indicated time: " + TimeFormatter.formatTime(time));

        // Advance the time by five seconds
        time.advanceByFiveSeconds();

        // Display the new time
        System.out.println("New time: " + TimeFormatter.formatTime(time));
    }
}