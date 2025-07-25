public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = normalizeHours(hours);
        this.minutes = normalizeMinutes(minutes);
        this.seconds = normalizeSeconds(seconds);
    }

    private int normalizeHours(int hours) {
        return Math.floorMod(hours, 24);
    }

    private int normalizeMinutes(int minutes) {
        return Math.floorMod(minutes, 60);
    }

    private int normalizeSeconds(int seconds) {
        return Math.floorMod(seconds, 60);
    }

    public boolean tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                    return true; // New day
                }
            }
        }
        return false;
    }

    public String format(boolean twelveHourFormat) {
        if (twelveHourFormat) {
            int displayHours = hours % 12;
            displayHours = displayHours == 0 ? 12 : displayHours;
            String period = hours < 12 ? "AM" : "PM";
            return String.format("%02d:%02d:%02d %s", displayHours, minutes, seconds, period);
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }

    // Getters
    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }
}