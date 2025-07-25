package exercise4;

public class DateWithEnums {
    private int day;
    private Month month;
    private int year;

    public DateWithEnums(int day, Month month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            this.day = 1;
            this.month = Month.JANUARY;
            this.year = 2000;
        }
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int daysInMonth() {
        return month.getDays(isLeapYear());
    }

    public void advance() {
        day++;
        if (day > daysInMonth()) {
            day = 1;
            month = month.next();
            if (month == Month.JANUARY) {
                year++;
            }
        }
    }

    public String format(boolean us, String delimiter) {
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month.ordinal() + 1);
        if (us) {
            return formattedMonth + delimiter + formattedDay + delimiter + year;
        } else {
            return formattedDay + delimiter + formattedMonth + delimiter + year;
        }
    }

    private boolean isValidDate(int day, Month month, int year) {
        if (month == null) return false;
        if (day < 1 || day > month.getDays(isLeapYear())) return false;
        return true;
    }

    public enum Month {
        JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
        JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

        private final int days;

        Month(int days) {
            this.days = days;
        }

        public int getDays(boolean leapYear) {
            if (this == FEBRUARY && leapYear) {
                return 29;
            }
            return days;
        }

        public Month next() {
            return values()[(this.ordinal() + 1) % values().length];
        }
    }
}