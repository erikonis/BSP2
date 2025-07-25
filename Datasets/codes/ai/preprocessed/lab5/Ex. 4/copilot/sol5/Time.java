public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) hours = 0;
        if (minutes < 0 || minutes > 59) minutes = 0;
        if (seconds < 0 || seconds > 59) seconds = 0;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean tick() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                if (hours > 23) {
                    hours = 0;
                    return true; // New day
                }
            }
        }
        return false;
    }

    public String format(boolean us) {
        String formattedHours = us ? String.format("%02d", (hours % 12 == 0) ? 12 : hours % 12) : String.format("%02d", hours);
        String suffix = us ? (hours < 12 ? " AM" : " PM") : "";
        return String.format("%02d:%02d:%02d", formattedHours, minutes, seconds) + suffix;
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}