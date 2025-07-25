public class DateTime {
    private Date date;
    private Time time;

    // Constructor to initialize date and time
    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    // Method to advance the time by one second and date by one day if necessary
    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    // Method to print the current date and time
    public void print(boolean us, String delimiter) {
        System.out.println(date.format(us, delimiter) + " " + time.format(us));
    }
}
