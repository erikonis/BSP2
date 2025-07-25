public class DateTime {
    private final Date date;
    private final Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    public void print(boolean usFormat, String dateDelimiter) {
        System.out.printf("%s %s%n", 
            date.format(usFormat, dateDelimiter),
            time.format(usFormat));
    }

    // Getters
    public Date getDate() { return date; }
    public Time getTime() { return time; }
}