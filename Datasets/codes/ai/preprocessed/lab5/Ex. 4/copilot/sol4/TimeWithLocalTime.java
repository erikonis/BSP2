import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeWithLocalTime {
    private LocalTime time;

    public TimeWithLocalTime(int hours, int minutes, int seconds) {
        this.time = LocalTime.of(hours, minutes, seconds);
    }

    public boolean tick() {
        time = time.plusSeconds(1);
        return time.equals(LocalTime.MIDNIGHT);
    }

    public String format(boolean us) {
        DateTimeFormatter formatter = us ? DateTimeFormatter.ofPattern("hh:mm:ss a")
                                         : DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

    public int secondsSinceMidnight() {
        return time.toSecondOfDay();
    }

    public int secondsUntilMidnight() {
        return 86400 - secondsSinceMidnight();
    }
}