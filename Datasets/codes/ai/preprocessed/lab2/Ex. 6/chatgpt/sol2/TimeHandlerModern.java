import java.time.LocalTime;
import java.util.Scanner;

public class TimeHandlerModern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        scanner.close();

        try {
            LocalTime time = LocalTime.of(hours, minutes, seconds).plusSeconds(5);
            System.out.println("Updated Time: " + time);
        } catch (Exception e) {
            System.out.println("Invalid time input!");
        }
    }
}