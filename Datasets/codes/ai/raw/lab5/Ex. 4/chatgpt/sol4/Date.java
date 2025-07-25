public class Date {
    private int day, month, year;
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = Math.max(1, Math.min(month, 12));
        this.day = Math.max(1, Math.min(day, daysInMonth()));
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth() {
        return (month == 2 && isLeapYear()) ? 29 : DAYS_IN_MONTH[month - 1];
    }

    public void advance() {
        if (++day > daysInMonth()) {
            day = 1;
            if (++month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public String format(boolean us, String delimiter) {
        return us
            ? String.format("%02d%s%02d%s%04d", month, delimiter, day, delimiter, year)
            : String.format("%02d%s%02d%s%04d", day, delimiter, month, delimiter, year);
    }
}
