public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = validateHours(hours);
        this.minutes = validateMinutes(minutes);
        this.seconds = validateSeconds(seconds);
    }

    private int validateHours(int hours) {
        return Math.max(0, Math.min(23, hours));
    }

    private int validateMinutes(int minutes) {
        return Math.max(0, Math.min(59, minutes));
    }

    private int validateSeconds(int seconds) {
        return Math.max(0, Math.min(59, seconds));
    }

    public boolean tick() {
        boolean newDay = false;
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                if (hours > 23) {
                    hours = 0;
                    newDay = true;
                }
            }
        }
        return newDay;
    }

    public String format(boolean us) {
        if (us) {
            int displayHours = hours % 12;
            if (displayHours == 0) displayHours = 12;
            String ampm = hours < 12 ? "AM" : "PM";
            return String.format("%02d:%02d:%02d %s", displayHours, minutes, seconds, ampm);
        }
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }
}