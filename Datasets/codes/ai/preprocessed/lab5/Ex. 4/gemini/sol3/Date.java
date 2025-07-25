import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private final int year; // Year should be final

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = validateMonth(month);
        this.day = validateDay(day, this.month, this.year);
    }

    private int validateMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12 (was " + month + ").");
        }
        return month;
    }

    private int validateDay(int day, int month, int year) {
        int maxDays = daysInMonth(month, year);
        if (day < 1 || day > maxDays) {
            throw new IllegalArgumentException("Day must be between 1 and " + maxDays + " (was " + day + ").");
        }
        return day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth(int month, int year) {
        // Moved the month validation to its own method.
        switch (month) {
            case 2:
                return isLeapYear() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public void advance() {
        day++;
        if (day > daysInMonth(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public String format(boolean usFormat, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        return usFormat
                ? formattedMonth + delimiter + formattedDay + delimiter + year
                : formattedDay + delimiter + formattedMonth + delimiter + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day && month == date.month && year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "Date {day=" + day + ", month=" + month + ", year=" + year + "}";
    }
}