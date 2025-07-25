import java.util.Objects;

public class Date {
    private final int day;
    private final int month;
    private final int year;

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

    public Date advance() {
        int newDay = day + 1;
        int newMonth = month;
        int newYear = year;

        if (newDay > daysInMonth(month, year)) {
            newDay = 1;
            newMonth = month + 1;
            if (newMonth > 12) {
                newMonth = 1;
                newYear = year + 1;
            }
        }
        return new Date(newDay, newMonth, newYear);
    }

    public String format(boolean usFormat, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        return usFormat ? formattedMonth + delimiter + formattedDay + delimiter + year
                       : formattedDay + delimiter + formattedMonth + delimiter + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date other = (Date) o;
        return day == other.day && month == other.month && year == other.year;
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