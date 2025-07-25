public class Main {
    public static void main(String[] args) {
        Date date = new Date(28, 2, 2024); // Leap year test
        Time time = new Time(23, 59, 59);
        DateTime dateTime = new DateTime(date, time);

        System.out.println("Initial:");
        dateTime.print(false, "/");

        dateTime.tick(); // Should move to the next day
        System.out.println("After one second:");
        dateTime.print(false, "/");

        System.out.println("Is leap year? " + date.isLeapYear());
        System.out.println("Seconds since midnight: " + time.secondsSinceMidnight());
        System.out.println("Seconds until midnight: " + time.secondsUntilMidnight());
    }
}