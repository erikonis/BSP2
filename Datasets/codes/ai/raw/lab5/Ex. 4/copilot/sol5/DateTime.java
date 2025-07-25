public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
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
