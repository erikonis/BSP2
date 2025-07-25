public class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        setDate(day, month, year);
    }

    private void setDate(int d, int m, int y) {
        this.year = y;
        this.month = (m >= 1 && m <= 12) ? m : 1;
        int maxDays = daysInMonth();
        this.day = (d >= 1 && d <= maxDays) ? d : 1;
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

    public void advanceDay() {
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

    public String format(boolean usFormat, String delimiter) {
        String d = String.format("%02d", day);
        String m = String.format("%02d", month);
        String y = String.valueOf(year);
        return usFormat ? m + delimiter + d + delimiter + y : d + delimiter + m + delimiter + y;
    }
}
