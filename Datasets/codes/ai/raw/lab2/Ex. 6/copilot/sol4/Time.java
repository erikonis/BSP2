public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private int format; // 12 or 24
    private String period; // AM or PM for 12-hour format

    public Time(int hours, int minutes, int seconds, int format, String period) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.format = format;
        this.period = period;
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

    public int getFormat() {
        return format;
    }

    public String getPeriod() {
        return period;
    }

    public void advanceByFiveSeconds() {
        seconds += 5;
        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
            if (minutes >= 60) {
                minutes -= 60;
                hours++;
                if (format == 12) {
                    if (hours > 12) {
                        hours -= 12;
                    } else if (hours == 12) {
                        period = period.equals("AM") ? "PM" : "AM";
                    }
                } else {
                    if (hours >= 24) {
                        hours -= 24;
                    }
                }
            }
        }
    }
}
