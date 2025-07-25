public class DateTimeWithLocalDateTime {
    private DateWithLocalDate date;
    private TimeWithLocalTime time;

    public DateTimeWithLocalDateTime(DateWithLocalDate date, TimeWithLocalTime time) {
        this.date = date;
        this.time = time;
    }

    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    public void print(boolean us, String delimiter) {
        System.out.println(date.format(us, delimiter) + " " + time.format(us));
    }
}