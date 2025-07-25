package Exercise4;

public class Date {
    private int d, m, y;

    Date(int d, int m, int y) {
        this.y = y;
        this.m = m;
        if (d <= daysInMonth())
            this.d = d;
        else
            this.d = daysInMonth();
    }

    public boolean isLeapYear() {
        if (y % 4 != 0)
            return false;
        else if (y % 100 != 0)
            return true;
        else if (y % 400 != 0)
            return false;
        else
            return true;
    }

    public int daysInMonth() {
        if (m < 8)
            if (m % 2 == 1)
                return 31;
            else if (m != 2)
                return 30;
            else if (isLeapYear())
                return 29;
            else
                return 28;
        else if (m % 2 == 0)
            return 31;
        else
            return 30;
    }

    public void advance() {
        if (d < daysInMonth())
            d++;
        else if (m < 12) {
            m++;
            d = 1;
        } else {
            y++;
            m = 1;
            d = 1;
        }

    }

    public String format(boolean us, String delimiter) {
        String d, m, y, date;
        if (this.d < 10)
            d = "0" + this.d;
        else
            d = "" + this.d;
        if (this.m < 10)
            m = "0" + this.m;
        else
            m = "" + this.m;
        if (this.y % 100 < 10)
            y = "0" + this.y % 10;
        else
            y = "" + this.y % 100;
        if (us)
            date = m + delimiter + d + delimiter + y;
        else
            date = d + delimiter + m + delimiter + y;
        return date;
    }

}
