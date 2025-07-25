import java.util.Objects;

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
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Hours must be between 0 and 23 (was " + hours + ").");
        }
        return hours;
    }

    private int validateMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutes must be between 0 and 59 (was " + minutes + ").");
        }
        return minutes;
    }

    private int validateSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("Seconds must be between 0 and 59 (was " + seconds + ").");
        }
        return seconds;
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

    public Time tick() {
        int newSeconds = seconds + 1;
        int newMinutes = minutes;
        int newHours = hours;

        if (newSeconds >= 60) {
            newSeconds = 0;
            newMinutes = minutes + 1;
            if (newMinutes >= 60) {
                newMinutes = 0;
                newHours = hours + 1;
                if (newHours >= 24) {
                    newHours = 0;
                }
            }
        }
        return new Time(newHours, newMinutes, newSeconds);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time other = (Time) o;
        return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return "Time {hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "}";
    }
}