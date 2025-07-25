package exercise4;

public class DateTime {
    private Date date;
    private Time time;

    // Constructor to initialize date and time
    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    // Advance time by one second, and date if necessary
    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    // Print the current date and time
    public void print(boolean us, String delimiter) {
        System.out.println(date.format(us, delimiter) + " " + time.format(us));
    }
}