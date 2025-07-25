public class MyTime {
    private int hours, minutes, seconds;

    public MyTime(int h, int m, int s) {
        this.hours = (h >= 0 && h < 24) ? h : 0;
        this.minutes = (m >= 0 && m < 60) ? m : 0;
        this.seconds = (s >= 0 && s < 60) ? s : 0;
    }

    public boolean tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if (minutes >= 60) {
                minutes = 0;
                hours++;
                if (hours >= 24) {
                    hours = 0;
                    return true; // New day!
                }
            }
        }
        return false;
    }

    public String format(boolean usFormat) {
        int h = hours;
        String amPm = "";
        if (usFormat) {
            amPm = (h >= 12) ? "PM" : "AM";
            h = h % 12;
            if (h == 0) h = 12;
        }
        return String.format("%02d:%02d:%02d%s", h, minutes, seconds, usFormat ? " " + amPm : "");
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}
