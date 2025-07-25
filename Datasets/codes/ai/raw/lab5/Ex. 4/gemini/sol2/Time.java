public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours <= 23) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes <= 59) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds <= 59) ? seconds : 0;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
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
                    return true; // New day
                }
            }
        }
        return false;
    }

    public String format(boolean usFormat) {
        String formattedHours;
        if (usFormat) {
            int hour12 = (hours == 0 || hours == 12) ? 12 : hours % 12;
            formattedHours = String.format("%02d", hour12);
            String ampm = (hours < 12) ? "AM" : "PM";
            return formattedHours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds) + " " + ampm;
        } else {
            formattedHours = String.format("%02d", hours);
            return formattedHours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds);
        }
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}