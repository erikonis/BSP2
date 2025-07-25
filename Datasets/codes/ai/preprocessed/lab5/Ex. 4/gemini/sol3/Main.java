public class Main {
    public static void main(String[] args) {
        // Test Date class
        try {
            Date date1 = new Date(28, 2, 2023);
            System.out.println("Date1: " + date1.format(false, "."));
            System.out.println("Is 2023 a leap year? " + date1.isLeapYear());
            System.out.println("Days in Feb 2023: " + date1.daysInMonth(2, 2023));

            Date date2 = new Date(29, 2, 2024);
            System.out.println("Date2: " + date2.format(true, "/"));
            System.out.println("Is 2024 a leap year? " + date2.isLeapYear());
            System.out.println("Days in Feb 2024: " + date2.daysInMonth(2, 2024));

            Date date3 = new Date(31, 12, 2024);
            date3.advance();
            System.out.println("Date3 after advance: " + date3.format(false, "-"));

            Date invalidDate = new Date(32, 1, 2025);
            System.out.println("Invalid Date: " + invalidDate.format(true, "/")); // This line will not be reached

             //test equals and hashcode
            Date date4 = new Date(28, 2, 2023);
            System.out.println("Date1 equals Date4: " + date1.equals(date4));
            System.out.println("Date1 hash code: " + date1.hashCode());
            System.out.println("Date4 hash code: " + date4.hashCode());
            System.out.println("Date1: " + date1);


        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }


        // Test Time class
        try {
            Time time1 = new Time(23, 59, 58);
            System.out.println("Time1: " + time1.format(false));
            System.out.println("Seconds since midnight: " + time1.secondsSinceMidnight());
            System.out.println("Seconds until midnight: " + time1.secondsUntilMidnight());

            time1.tick();
            System.out.println("Time1 after tick: " + time1.format(false));
            System.out.println("New day? " + time1.tick());
            System.out.println("Time1 after 2 ticks: " + time1.format(true));

            Time invalidTime = new Time(24, 60, 60);
            System.out.println("Invalid Time: " + invalidTime.format(false)); //This line will not be reached.

             //test equals and hashcode
            Time time2 = new Time(23, 59, 58);
            System.out.println("Time1 equals Time2: " + time1.equals(time2));
            System.out.println("Time1 hash code: " + time1.hashCode());
            System.out.println("Time2 hash code: " + time2.hashCode());
            System.out.println("Time1: " + time1);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }


        // Test DateTime class
        try {
            Date initialDate = new Date(31, 12, 2023);
            Time initialTime = new Time(23, 59, 55);
            DateTime dateTime = new DateTime(initialDate, initialTime);

            System.out.println("Initial DateTime: ");
            dateTime.print(true, "/");

            for (int i = 0; i < 6; i++) {
                dateTime.tick();
                System.out.println("DateTime after tick " + (i + 1) + ":");
                dateTime.print(false, "-");
            }

            //test equals and hashcode
            DateTime dateTime2 = new DateTime(initialDate, initialTime);
            System.out.println("dateTime equals dateTime2: " + dateTime.equals(dateTime2));
            System.out.println("dateTime hash code: " + dateTime.hashCode());
            System.out.println("dateTime2 hash code: " + dateTime2.hashCode());
            System.out.println("dateTime: " + dateTime);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}