public class Main {
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2023);
        Time time = new Time(23, 59, 59);
        DateTime dt = new DateTime(date, time);

        System.out.println("Current DateTime:");
        dt.print(false, "-");

        dt.tick(); // Advance one second

        System.out.println("After tick:");
        dt.print(false, "-");

        System.out.println("Is leap year: " + date.isLeapYear());
        System.out.println("Seconds since midnight: " + time.secondsSinceMidnight());
        System.out.println("Seconds until midnight: " + time.secondsUntilMidnight());
    }
}
