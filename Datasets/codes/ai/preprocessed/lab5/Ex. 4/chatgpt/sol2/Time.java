public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours < 0 || hours > 23) ? 0 : hours;
        this.minutes = (minutes < 0 || minutes > 59) ? 0 : minutes;
        this.seconds = (seconds < 0 || seconds > 59) ? 0 : seconds;
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
                    return true; // new day
                }
            }
        }
        return false;
    }

    public String format(boolean us) {
        int h = hours;
        String suffix = "";
        if (us) {
            suffix = (h >= 12) ? "PM" : "AM";
            h = h % 12;
            if (h == 0) h = 12;
        }
        return String.format("%02d:%02d:%02d%s", h, minutes, seconds, us ? " " + suffix : "");
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}