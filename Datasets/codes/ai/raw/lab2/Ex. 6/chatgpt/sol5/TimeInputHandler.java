import java.util.Scanner;

public class TimeInputHandler {

    private Scanner scanner;

    public TimeInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getTimeFormat() {
        System.out.print("Enter time format (12-hour or 24-hour): ");
        return scanner.nextLine().toLowerCase();
    }

    public int getHour() {
        System.out.print("Enter hour: ");
        return scanner.nextInt();
    }

    public int getMinute() {
        System.out.print("Enter minute: ");
        return scanner.nextInt();
    }

    public int getSecond() {
        System.out.print("Enter second: ");
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
