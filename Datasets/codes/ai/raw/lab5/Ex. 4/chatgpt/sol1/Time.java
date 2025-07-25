public public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = Math.max(0, Math.min(hours, 23));
        this.minutes = Math.max(0, Math.min(minutes, 59));
        this.seconds = Math.max(0, Math.min(seconds, 59));
    }

    public boolean tick() {
        if (++seconds == 60) {
            seconds = 0;
            if (++minutes == 60) {
                minutes = 0;
                if (++hours == 24) {
                    hours = 0;
                    return true; // New day started
                }
            }
        }
        return false;
    }

    public String format(boolean us) {
        if (us) {
            int hourFormat = (hours == 0 || hours == 12) ? 12 : hours % 12;
            String ampm = hours < 12 ? "AM" : "PM";
            return String.format("%02d:%02d:%02d %s", hourFormat, minutes, seconds, ampm);
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}
 {
    
}
