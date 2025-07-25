public class as {
    
}
package exercise6;

import java.util.Scanner;

public class TimeHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read time and format
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        System.out.print("Enter format (12 or 24): ");
        int format = scanner.nextInt();
        scanner.close();

        // Validate time input
        if (hours < 0 || minutes < 0 || seconds < 0 || minutes > 59 || seconds > 59 || (format == 12 && hours > 12) || (format == 24 && hours > 23)) {
            System.out.println("Invalid time input!");
            return;
        }

        // Display formatted time
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);

        // Advance by 5 seconds
        seconds += 5;
        if (seconds >= 60) { seconds -= 60; minutes++; }
        if (minutes >= 60) { minutes = 0; hours++; }
        if (format == 12 && hours > 12) { hours = 1; }
        else if (format == 24 && hours > 23) { hours = 0; }

        System.out.printf("New Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
