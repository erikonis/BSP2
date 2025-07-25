public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize hours, minutes, and seconds
    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            hours = 0;
        }
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
        if (seconds < 0 || seconds > 59) {
            seconds = 0;
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to advance the time by one second
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
                    return true; // New day has begun
                }
            }
        }
        return false; // No new day
    }

    // Method to format the time
    public String format(boolean us) {
        String formattedHours = String.format("%02d", hours);
        String formattedMinutes = String.format("%02d", minutes);
        String formattedSeconds = String.format("%02d", seconds);
        if (us) {
            int displayHours = hours % 12 == 0 ? 12 : hours % 12;
            String suffix = hours < 12 ? "AM" : "PM";
            return String.format("%02d:%02d:%02d %s", displayHours, minutes, seconds, suffix);
        } else {
            return formattedHours + ":" + formattedMinutes + ":" + formattedSeconds;
        }
    }

    // Method to get the seconds since midnight
    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    // Method to get the seconds until midnight
    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}
