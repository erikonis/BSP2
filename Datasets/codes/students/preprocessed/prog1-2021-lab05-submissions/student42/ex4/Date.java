public class Date {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.year = year;
        this.month = Math.min(12, Math.max(month, 1));
        this.day = Math.min(this.daysInMonth(), Math.max(day, 1));
    }

    public int daysInMonth() {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return this.isLeapYear() ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;
        }
    }

    public boolean isLeapYear() {
        return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);
    }

    public void advance() {
        this.day++;

        if (this.day > this.daysInMonth()) {
            this.day = 1;
            this.month++;

            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public String format(boolean us, String delimiter) {
        if (us) {
            return (this.month < 10 ? "0" : "") + this.month + delimiter + (this.day < 10 ? "0" : "") + this.day
                    + delimiter + this.year;
        } else {
            return (this.day < 10 ? "0" : "") + this.day + delimiter + (this.month < 10 ? "0" : "") + this.month
                    + delimiter + this.year;
        }
    }
}