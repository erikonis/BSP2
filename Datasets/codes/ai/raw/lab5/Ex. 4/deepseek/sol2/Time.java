package exercise4;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (!isValidTime(hours, minutes, seconds)) {
            throw new IllegalArgumentException("Invalid time.");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60;
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

    public String format(boolean us) {
        String formattedHours = String.format("%02d", hours);
        String formattedMinutes = String.format("%02d", minutes);
        String formattedSeconds = String.format("%02d", seconds);
        if (us) {
            int usHours = hours % 12 == 0 ? 12 : hours % 12;
            String suffix = hours < 12 ? "AM" : "PM";
            return String.format("%02d:%s:%s %s", usHours, formattedMinutes, formattedSeconds, suffix);
        } else {
            return formattedHours + ":" + formattedMinutes + ":" + formattedSeconds;
        }
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