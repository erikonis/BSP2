public class DateTimeDemo {
    public static void main(String[] args) {
        // Test Date class
        Date date = new Date(28, 2, 2020); // Leap year
        System.out.println("Leap year? " + date.isLeapYear());
        System.out.println("Days in month: " + date.daysInMonth());
        System.out.println("EU format: " + date.format(false, "/"));
        System.out.println("US format: " + date.format(true, "-"));

        // Advance through month end
        for (int i = 0; i < 3; i++) {
            date.advance();
            System.out.println("Advanced date: " + date.format(false, "/"));
        }

        // Test Time class
        Time time = new Time(23, 59, 58);
        System.out.println("\nTime: " + time.format(false));
        System.out.println("Seconds since midnight: " + time.secondsSinceMidnight());
        System.out.println("Seconds until midnight: " + time.secondsUntilMidnight());

        // Tick through midnight
        for (int i = 0; i < 5; i++) {
            boolean newDay = time.tick();
            System.out.println("Ticked time: " + time.format(false) +
                             (newDay ? " (NEW DAY)" : ""));
        }

        // Test DateTime
        DateTime dateTime = new DateTime(new Date(31, 12, 2023), new Time(23, 59, 58));
        System.out.println("\nTesting DateTime:");
        for (int i = 0; i < 5; i++) {
            dateTime.print(false, ".");
            dateTime.tick();
        }
    }
}