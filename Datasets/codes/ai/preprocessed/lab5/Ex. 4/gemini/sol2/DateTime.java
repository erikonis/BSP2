public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public void tick() {
        if (time.tick()) { // If time.tick() returns true (new day)
            date.advance(); // Advance the date
        }
    }

    public void print(boolean usFormat, String delimiter) {
        System.out.println("Date: " + date.format(usFormat, delimiter) + ", Time: " + time.format(usFormat));
    }
}