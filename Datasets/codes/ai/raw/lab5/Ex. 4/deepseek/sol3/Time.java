public package exercise4;

public class Time {
    private static int hours;
    private static int minutes;
    private static int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (!isValidTime(hours, minutes, seconds)) {
            throw new IllegalArgumentException("Invalid time.");
        }
        Time.hours = hours;
        Time.minutes = minutes;
        Time.seconds = seconds;
    }

    private static boolean isValidTime(int hours, int minutes, int seconds) {
        return hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60;
    }

    public static boolean tick() {
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

    public static String format(boolean us) {
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

    public static int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public static int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }

    public static int getHours() { return hours; }
    public static int getMinutes() { return minutes; }
    public static int getSeconds() { return seconds; }
} {
    
}
