package lu.uni.programming1.lab5.exercise4;

public class Time {
    
    private int hours;

    private int minutes;

    private int seconds;

    Time(int hours, int minutes, int seconds) {

        //sets hours
        if (0 <= hours && hours <= 23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }

        //sets minutes
        if (0 <= minutes && minutes <= 59) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;

        }
        
        //sets seconds
        if (0 <= seconds && seconds <= 59) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public boolean tick() {
        boolean day = false;

        if (seconds != 59) {
            seconds += 1;
        } else {
            seconds = 0;

            //advances minutes if necessary
            if (minutes != 59) {
                minutes += 1;
            } else {
                minutes = 0;

                //advances hours if necessary
                if (hours != 23) {
                    hours += 1;
                } else {
                    hours = 0;

                    //advances day if necessary
                    day = true;
                }
            }
        }
        return day;
    }

    public String format(boolean us) {
        if (us) {
            //PM
            if (hours >= 13) {
                return String.format("%02d:%02d:%02d PM", (hours-12), minutes, seconds);
            } else if (hours == 12) {
                return String.format("%02d:%02d:%02d PM", hours, minutes, seconds);
            //AM
            } else if (hours == 0) {
                return String.format("%02d:%02d:%02d AM", 12, minutes, seconds);
            } else {
                return String.format("%02d:%02d:%02d AM", hours, minutes, seconds);
            }

        } else {
            return String.format("%02d:%02d:%02d" , hours, minutes, seconds);
        }
    }

    public int secondsSinceMidnight() {
        int timeSince = 0;

        timeSince += seconds;

        if (minutes > 0) {
            timeSince += minutes * 60;

            if (hours > 0) {
                timeSince += hours * 60 * 60;
            }
        }

        return timeSince;
    }

    public int secondsUntilMidnight() {
        int timeUntil = 0;

        timeUntil += 60 - seconds;

        if (minutes < 59) {
            timeUntil += (59 - minutes) * 60;

            if (hours < 23) {
                timeUntil += (23 - hours) * 60 * 60;
            }
        }

        //if it is midnight
        if (seconds == 0 && minutes == 0 && hours == 0) {
            timeUntil = 0;
        }

        return timeUntil;
    }
}
