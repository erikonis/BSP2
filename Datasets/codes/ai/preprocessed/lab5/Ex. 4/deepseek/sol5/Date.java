public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year = validateYear(year);
        this.month = validateMonth(month);
        this.day = validateDay(day, this.month, this.year);
    }

    private int validateYear(int year) {
        return Math.max(1, year); // Year must be at least 1
    }

    private int validateMonth(int month) {
        return Math.max(1, Math.min(12, month));
    }

    private int validateDay(int day, int month, int year) {
        int maxDays = getDaysInMonth(month, year);
        return Math.max(1, Math.min(maxDays, day));
    }

    public boolean isLeapYear() {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }

    public int getDaysInMonth() {
        return getDaysInMonth(month, year);
    }

    private int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear() ? 29 : 28;
            default -> 31;
        };
    }

    public void advance() {
        if (day < getDaysInMonth()) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    public String format(boolean usFormat, String delimiter) {
        return usFormat
            ? String.format("%02d%s%02d%s%04d", month, delimiter, day, delimiter, year)
            : String.format("%02d%s%02d%s%04d", day, delimiter, month, delimiter, year);
    }

    // Getters
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
}