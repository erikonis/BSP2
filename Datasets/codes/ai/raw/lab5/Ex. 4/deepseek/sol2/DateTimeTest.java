package exercise4;

public class DateTimeTest {
    public static void main(String[] args) {
        Date date = new Date(31, 12, 2022);
        Time time = new Time(23, 59, 59);
        DateTime dateTime = new DateTime(date, time);

        dateTime.print(false, "-"); // Output: 31-12-2022 23:59:59
        dateTime.tick();
        dateTime.print(false, "-"); // Output: 01-01-2023 00:00:00

        dateTime.print(true, "/"); // Output: 01/01/2023 12:00:00 AM

        Date leapDate = new Date(28, 2, 2020);
        System.out.println("Is 2020 a leap year? " + leapDate.isLeapYear()); // Output: true

        Time testTime = new Time(12, 30, 45);
        System.out.println("Seconds since midnight: " + testTime.secondsSinceMidnight()); // Output: 45045
        System.out.println("Seconds until midnight: " + testTime.secondsUntilMidnight()); // Output: 41955
    }
}