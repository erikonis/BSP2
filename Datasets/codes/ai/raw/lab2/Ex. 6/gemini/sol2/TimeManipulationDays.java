import java.util.Scanner;

public class TimeManipulationDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        System.out.print("Enter clock format (12/24): ");
        int format = scanner.nextInt();

        // Sanity checks
        if (hours < 0 || hours > (format == 12 ? 12 : 23) ||
                minutes < 0 || minutes > 59 ||
                seconds < 0 || seconds > 59 ||
                (format != 12 && format != 24)) {
            System.out.println("Invalid input.");
            return;
        }

        // Display initial time
        System.out.printf("Initial time: %02d:%02d:%02d\n", hours, minutes, seconds);

        // Advance time by 5 seconds
        seconds += 5;
        if (seconds >= 60) {
            seconds %= 60;
            minutes++;
            if (minutes >= 60) {
                minutes %= 60;
                hours++;
                if (hours >= (format == 12 ? 13 : 24)) {
                    hours %= (format == 12 ? 12 : 24);
                    // Add a day (not fully implemented - just a placeholder)
                    System.out.println("Next day!");
                }
            }
        }

        // Display new time
        System.out.printf("New time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}