public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours % 24;
        this.minutes = minutes % 60;
        this.seconds = seconds % 60;
    }

    public boolean tick() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            minutes = (minutes + 1) % 60;
            if (minutes == 0) {
                hours = (hours + 1) % 24;
                return hours == 0; // New day started
            }
        }
        return false;
    }

    public String format(boolean us) {
        int hourFormat = us ? ((hours % 12 == 0) ? 12 : hours % 12) : hours;
        String ampm = us ? (hours < 12 ? "AM" : "PM") : "";
        return String.format("%02d:%02d:%02d %s", hourFormat, minutes, seconds, ampm).trim();
    }
}
