public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        sanitize();
    }

    private void sanitize() {
        this.minutes += this.seconds / 60;
        this.seconds %= 60;
        this.hours += this.minutes / 60;
        this.minutes %= 60;
        this.hours %= 24;
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

    public void advance(int seconds) {
        this.seconds += seconds;
        sanitize();
    }

    public String format() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}