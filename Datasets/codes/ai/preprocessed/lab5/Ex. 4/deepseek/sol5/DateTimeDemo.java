public class DateTimeDemo {
    public static void main(String[] args) {
        // Test Date functionality
        testDateOperations();

        // Test Time functionality
        testTimeOperations();

        // Test DateTime integration
        testDateTimeIntegration();
    }

    private static void testDateOperations() {
        System.out.println("\n=== Testing Date ===");
        Date date = new Date(28, 2, 2024); // Leap year

        System.out.println("Is leap year? " + date.isLeapYear());
        System.out.println("Days in month: " + date.getDaysInMonth());
        System.out.println("EU format: " + date.format(false, "/"));
        System.out.println("US format: " + date.format(true, "-"));

        System.out.println("\nAdvancing through month end:");
        for (int i = 0; i < 3; i++) {
            date.advance();
            System.out.println(date.format(false, "/"));
        }
    }

    private static void testTimeOperations() {
        System.out.println("\n=== Testing Time ===");
        Time time = new Time(23, 59, 58);

        System.out.println("24-hour format: " + time.format(false));
        System.out.println("12-hour format: " + time.format(true));
        System.out.println("Seconds since midnight: " + time.secondsSinceMidnight());
        System.out.println("Seconds until midnight: " + time.secondsUntilMidnight());

        System.out.println("\nTicking through midnight:");
        for (int i = 0; i < 5; i++) {
            boolean newDay = time.tick();
            System.out.println(time.format(false) + (newDay ? " (NEW DAY)" : ""));
        }
    }

    private static void testDateTimeIntegration() {
        System.out.println("\n=== Testing DateTime ===");
        DateTime dateTime = new DateTime(
            new Date(31, 12, 2023),
            new Time(23, 59, 58)
        );

        System.out.println("Initial datetime:");
        dateTime.print(false, ".");

        System.out.println("\nTicking through new year:");
        for (int i = 0; i < 5; i++) {
            dateTime.tick();
            dateTime.print(false, ".");
        }
    }
}