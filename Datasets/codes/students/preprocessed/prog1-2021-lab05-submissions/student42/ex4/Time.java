public class Time {

    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = Math.min(23, Math.max(0, hours));
        this.minutes = Math.min(59, Math.max(0, minutes));
        this.seconds = Math.min(59, Math.max(0, seconds));
    }

    public String format(boolean us) {

        int formattedHours = this.hours;

        if (us) {
            formattedHours = this.hours % 12 == 0 ? 12 : this.hours % 12;
        }

        return (formattedHours < 10 ? "0" : "") + formattedHours + ":" + (this.minutes < 10 ? "0" : "") + this.minutes
                + ":" + (this.seconds < 10 ? "0" : "") + this.seconds + (us ? this.hours < 12 ? " AM" : " PM" : "");
    }

    /**
     * Advances the time by one second.
     *
     * @return True if there is a day report/overflow, false otherwise.
     */
    public boolean tick() {
        this.seconds++;

        if (this.seconds == 60) {
            this.seconds = 0;
            this.minutes++;

            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;

                if (this.hours == 24) {
                    this.hours = 0;
                    return true;
                }
            }
        }

        return false;
    }

    public int secondsSinceMidnight() {
        return (this.hours * 60 + this.minutes) * 60 + this.seconds;
    }

    public int secondsUntilMidnight() {
        return 86400 - this.secondsSinceMidnight();
    }
}