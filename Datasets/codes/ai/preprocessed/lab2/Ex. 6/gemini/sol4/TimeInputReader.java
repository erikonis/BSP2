import java.util.Scanner;

public class TimeInputReader {
    private final Scanner scanner;

    public TimeInputReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Time readTime() {
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
                scanner.next(); // consume invalid input
            }
        }

        while (minutes < 0 || minutes > 59) {
            System.out.print("Enter minutes (0-59): ");
            if (scanner.hasNextInt()) {
                minutes = scanner.nextInt();
            } else {
                System.out.println("Invalid input for minutes. Please enter a number.");
                scanner.next(); // consume invalid input
            }
        }

        while (seconds < 0 || seconds > 59) {
            System.out.print("Enter seconds (0-59): ");
            if (scanner.hasNextInt()) {
                seconds = scanner.nextInt();
            } else {
                System.out.println("Invalid input for seconds. Please enter a number.");
                scanner.next(); // consume invalid input
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
                scanner.next(); // consume invalid input
            }
        }

        return new Time(hours, minutes, seconds);
    }
}