public class DateTime {

    Date date;
    Time time;

    public DateTime(int day, int month, int year, int hours, int minutes, int seconds) {
        this.date = new Date(day, month, year);
        this.time = new Time(hours, minutes, seconds);
    }

    public void tick() {
        if (this.time.tick()) {
            this.date.advance();
        }
    }

    public void print(boolean us, String delimiter) {
        System.out.println(this.date.format(us, delimiter) + " " + this.time.format(us));
    }

    public static void main(String[] args) {
        DateTime d1 = new DateTime(31, 12, 2016, 23, 59, 59);
        d1.print(false, ".");
        d1.tick();
        d1.print(false, ".");

        DateTime d2 = new DateTime(28, 2, 2016, 23, 59, 59);
        d2.print(true, "/");
        d2.tick();
        d2.print(true, "/");
    }
}