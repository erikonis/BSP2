public package datetime;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        validateTime();
    }

    private void validateTime() {
        if (hours < 0 || hours > 23) {
            hours = 0;
        }
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
        if (seconds < 0 || seconds > 59) {
            seconds = 0;
        }
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
                    return true;
                }
            }
        }
        return false;
    }

    public String format(boolean us) {
        String hoursStr = String.format("%02d", hours);
        String minutesStr = String.format("%02d", minutes);
        String secondsStr = String.format("%02d", seconds);
        if (us) {
            int displayHours = hours % 12 == 0 ? 12 : hours % 12;
            String ampm = hours < 12 ? "AM" : "PM";
            return String.format("%02d", displayHours) + ":" + minutesStr + ":" + secondsStr + " " + ampm;
        } else {
            return hoursStr + ":" + minutesStr + ":" + secondsStr;
        }
    }

    public int secondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
} {

}