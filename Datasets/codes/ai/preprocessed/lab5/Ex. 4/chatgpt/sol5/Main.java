public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(28, 2, 2024); // Leap year
        MyTime time = new MyTime(23, 59, 58);
        MyDateTime dateTime = new MyDateTime(date, time);

        System.out.println("Initial:");
        dateTime.print(false, "/");

        // Advance a few seconds
        for (int i = 0; i < 5; i++) {
            dateTime.tick();
            dateTime.print(false, "/");
        }

        // Extra tests
        System.out.println("Leap Year? " + date.isLeapYear());
        System.out.println("Seconds since midnight: " + time.secondsSinceMidnight());
        System.out.println("Seconds until midnight: " + time.secondsUntilMidnight());
    }
}