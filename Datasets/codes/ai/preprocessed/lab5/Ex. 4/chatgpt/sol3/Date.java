public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        if (month < 1 || month > 12) month = 1;
        this.month = month;
        this.year = year;

        if (day < 1 || day > daysInMonth()) day = 1;
        this.day = day;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth() {
        switch (month) {
            case 2:
                return isLeapYear() ? 29 : 28;
            case 4: case 6: case 9: case 11:
                return 30;
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
        String d = String.format("%02d", day);
        String m = String.format("%02d", month);
        String y = String.valueOf(year);
        return us ? m + delimiter + d + delimiter + y : d + delimiter + m + delimiter + y;
    }
}