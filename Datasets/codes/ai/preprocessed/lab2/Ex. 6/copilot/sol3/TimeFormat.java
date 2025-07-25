import java.util.Scanner;

public class TimeFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read hours, minutes, seconds, and format
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

        // Display the indicated time
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        if (format == 12) {
            time += " " + period;
        }
        System.out.println("Indicated time: " + time);

        // Advance the time by five seconds
        seconds += 5;
        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
            if (minutes >= 60) {
                minutes -= 60;
                hours++;
                if (format == 12) {
                    if (hours > 12) {
                        hours -= 12;
                    } else if (hours == 12) {
                        period = period.equals("AM") ? "PM" : "AM";
                    }
                } else {
                    if (hours >= 24) {
                        hours -= 24;
                    }
                }
            }
        }

        // Display the new time
        time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        if (format == 12) {
            time += " " + period;
        }
        System.out.println("New time: " + time);
    }
}