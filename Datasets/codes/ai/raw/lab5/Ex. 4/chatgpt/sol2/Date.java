public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (month < 1 || month > 12) month = 1;
        if (day < 1 || day > daysInMonth(month, year)) day = 1;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2: return isLeapYear() ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    public int daysInMonth() {
        return daysInMonth(month, year);
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
        String d = (day < 10 ? "0" : "") + day;
        String m = (month < 10 ? "0" : "") + month;
        String y = String.valueOf(year);
        return us ? m + delimiter + d + delimiter + y : d + delimiter + m + delimiter + y;
    }
}
