public class Date {
    private static int day;
    private static int month;
    private static int year;

    public Date(int day, int month, int year) {
        if (!isValidDate(day, month, year)) {
            throw new IllegalArgumentException("Invalid date.");
        }
        Date.day = day;
        Date.month = month;
        Date.year = year;
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }
        return day <= daysInMonth(month, year);
    }

    public static boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int daysInMonth() {
        return daysInMonth(month, year);
    }

    private static int daysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 31;
        }
    }

    public static void advance() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public static String format(boolean us, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        if (us) {
            return formattedMonth + delimiter + formattedDay + delimiter + year;
        } else {
            return formattedDay + delimiter + formattedMonth + delimiter + year;
        }
    }

    public static int getDay() { return day; }
    public static int getMonth() { return month; }
    public static int getYear() { return year; }
}