import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = -1;
        int minutes = -1;
        int seconds = -1;
        int format = -1;
        String ampm = "";

        // Read time components
        while (hours < 0 || hours > 23) {
            System.out.print("Enter hours (0-23): ");
            if (scanner.hasNextInt()) {
                hours = scanner.nextInt();
            } else {
                System.out.println("Invalid input for hours. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }

        while (minutes < 0 || minutes > 59) {
            System.out.print("Enter minutes (0-59): ");
            if (scanner.hasNextInt()) {
                minutes = scanner.nextInt();
            } else {
                System.out.println("Invalid input for minutes. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }

        while (seconds < 0 || seconds > 59) {
            System.out.print("Enter seconds (0-59): ");
            if (scanner.hasNextInt()) {
                seconds = scanner.nextInt();
            } else {
                System.out.println("Invalid input for seconds. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }

        while (format != 12 && format != 24) {
            System.out.print("Enter clock format (12 or 24): ");
            if (scanner.hasNextInt()) {
                format = scanner.nextInt();
                if (format == 12) {
                    System.out.print("Enter AM or PM: ");
                    ampm = scanner.next().toUpperCase();
                    if (!ampm.equals("AM") && !ampm.equals("PM")) {
                        System.out.println("Invalid AM/PM format.");
                        format = -1;
                    } else if (hours < 1 || hours > 12) {
                        System.out.println("Invalid hours for 12-hour format (1-12).");
                        format = -1;
                    } else if (hours == 12 && ampm.equals("AM")) {
                        hours = 0; // Midnight in 24-hour format
                    } else if (hours != 12 && ampm.equals("PM")) {
                        hours += 12; // Convert to 24-hour format
                    }
                } else if (format != 24 && format != -1) {
                    System.out.println("Invalid clock format. Please enter 12 or 24.");
                }
            } else {
                System.out.println("Invalid input for format. Please enter a number.");
                scanner.next(); // consume the invalid input
            }
        }

        // Display the indicated time
        System.out.println("Indicated time: " + formatTime(hours, minutes, seconds));

        // Advance the time by five seconds
        seconds += 5;
        if (seconds > 59) {
            minutes++;
            seconds -= 60;
            if (minutes > 59) {
                hours++;
                minutes -= 60;
                if (hours > 23) {
                    hours = 0;
                }
            }
        }

        // Display the new time
        System.out.println("Time after 5 seconds: " + formatTime(hours, minutes, seconds));

        scanner.close();
    }

    // Helper function to format time with leading zeros
    private static String formatTime(int h, int m, int s) {
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}