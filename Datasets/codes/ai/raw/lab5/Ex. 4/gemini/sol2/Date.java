public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year = year; // Year is always considered valid for simplicity
        this.month = (month >= 1 && month <= 12) ? month : 1; // Correct month if invalid
        this.day = correctDay(day, this.month, this.year);
    }

    private int correctDay(int day, int month, int year) {
        int maxDays = daysInMonth(month, year);
        return (day >= 1 && day <= maxDays) ? day : 1; // Correct day if invalid
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
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            default:
                return 31; //handles invalid month.
        }
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
        if (usFormat) {
            return formattedMonth + delimiter + formattedDay + delimiter + year;
        } else {
            return formattedDay + delimiter + formattedMonth + delimiter + year;
        }
    }
}
