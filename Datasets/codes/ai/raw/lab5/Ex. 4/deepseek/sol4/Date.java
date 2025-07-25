public class Date {
    private int day;
    private int month;
    private final int year;

    public Date(int day, int month, int year) {
        this.year = validateYear(year);
        this.month = validateMonth(month);
        this.day = validateDay(day);
    }

    private int validateYear(int year) {
        return Math.max(year, 0);
    }

    private int validateMonth(int month) {
        return Math.max(1, Math.min(12, month));
    }

    private int validateDay(int day) {
        return Math.max(1, Math.min(daysInMonth(), day));
    }

    public boolean isLeapYear() {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

    public int daysInMonth() {
        if (month == 2) {
            return isLeapYear() ? 29 : 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    public void advance() {
        if (day < daysInMonth()) {
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

    public String format(boolean us, String delimiter) {
        String dayStr = String.format("%02d", day);
        String monthStr = String.format("%02d", month);
        String yearStr = String.format("%04d", year);
        
        if (us) {
            return monthStr + delimiter + dayStr + delimiter + yearStr;
        }
        return dayStr + delimiter + monthStr + delimiter + yearStr;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
}