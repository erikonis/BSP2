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
        System.out.print("Enter format (12/24): ");
        int format = scanner.nextInt();

        if (format == 12) {
            System.out.print("Enter AM/PM: ");
            String ampm = scanner.next();
            if (ampm.equalsIgnoreCase("PM") && hours != 12) {
                hours += 12;
            } else if (ampm.equalsIgnoreCase("AM") && hours == 12) {
                hours = 0;
            }
        }

        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);

        seconds += 5;
        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }

        System.out.printf("New Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}