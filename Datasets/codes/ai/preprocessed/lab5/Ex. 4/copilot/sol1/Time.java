public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours < 24) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds < 60) ? seconds : 0;
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
                    return true;
                }
            }
        }
        return false;
    }

    public String format(boolean us) {
        String formattedHours = String.format("%02d", us ? (hours % 12 == 0 ? 12 : hours % 12) : hours);
        String formattedMinutes = String.format("%02d", minutes);
        String formattedSeconds = String.format("%02d", seconds);
        String suffix = us ? (hours < 12 ? "AM" : "PM") : "";
        return formattedHours + ":" + formattedMinutes + ":" + formattedSeconds + suffix;
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}