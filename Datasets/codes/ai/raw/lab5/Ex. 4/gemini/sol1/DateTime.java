package datetime;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        this.date = new Date(day, month, year);
        this.time = new Time(hours, minutes, seconds);
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