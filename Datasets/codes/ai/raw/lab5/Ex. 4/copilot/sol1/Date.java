package exercise4;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 2000;
        }
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth() {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 31;
        }
    }

    public void advance() {
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

    public String format(boolean us, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        if (us) {
            return formattedMonth + delimiter + formattedDay + delimiter + year;
        } else {
            return formattedDay + delimiter + formattedMonth + delimiter + year;
        }
    }

    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth()) return false;
        return true;
    }
}