public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
        validateDate();
    }

    private void validateDate() {
        if (month < 1 || month > 12) {
            month = 1;
        }
        int maxDays = daysInMonth();
        if (day < 1 || day > maxDays) {
            day = 1;
        }
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth() {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
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
        String dayStr = String.format("%02d", day);
        String monthStr = String.format("%02d", month);
        if (us) {
            return monthStr + delimiter + dayStr + delimiter + year;
        } else {
            return dayStr + delimiter + monthStr + delimiter + year;
        }
    }
}