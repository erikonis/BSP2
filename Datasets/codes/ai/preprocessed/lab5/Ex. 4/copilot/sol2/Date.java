public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor to initialize day, month, and year
    public Date(int day, int month, int year) {
        if (month < 1 || month > 12) {
            month = 1;
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            day = 1;
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to check if the year is a leap year
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in the current month
    public int daysInMonth() {
        return daysInMonth(month, year);
    }

    // Helper method to get the number of days in a specific month and year
    private int daysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return 31;
        }
    }

    // Method to advance the date by one day
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

    // Method to format the date
    public String format(boolean us, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        String formattedYear = String.format("%04d", year);
        if (us) {
            return formattedMonth + delimiter + formattedDay + delimiter + formattedYear;
        } else {
            return formattedDay + delimiter + formattedMonth + delimiter + formattedYear;
        }
    }
}