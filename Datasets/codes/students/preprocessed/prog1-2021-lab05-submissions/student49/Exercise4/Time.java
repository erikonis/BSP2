public class Time {
    private int h, m, s;

    Time(int h, int m, int s) {
        if (h < 24)
            this.h = h;
        else
            this.h = 23;

        if (m < 60)
            this.m = m;
        else
            this.m = 59;

        if (s < 60)
            this.s = s;
        else
            this.s = 59;
    }

    public boolean tick() {
        if (s == 59) {
            s = 0;
            m = m + 1;
            if (m == 60) {
                m = 0;
                h++;
            }
            if (h == 24) {
                h = 0;
                return true;
            }
        } else
            s++;
        return false;
    }

    public String format(boolean us) {
        String s, m, h, time, mer = "";
        if (this.s < 10)
            s = "0" + this.s;
        else
            s = "" + this.s;
        if (this.m < 10)
            m = "0" + this.m;
        else
            m = "" + this.m;

        if (us) {
            int hr;
            if (this.h >= 12) {
                mer = "PM";
                hr = this.h - 12;
            } else {
                mer = "AM";
                hr = this.h;
            }
            if (hr < 10)
                h = "0" + hr;
            else
                h = "" + hr;
        } else if (this.h < 10)
            h = "0" + this.h;
        else
            h = "" + this.h;

        if (us)
            time = h + ":" + m + ":" + s + " " + mer;
        else
            time = h + ":" + m + ":" + s;
        return time;

    }

    public int secondsSinceMidnight() {
        return s + m * 60 + h * 3600;
    }

    public int secondsUntilMidnight() {
        return 24 * 3600 - secondsSinceMidnight();
    }

}
