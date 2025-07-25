public class MyDateTime {
    private MyDate date;
    private MyTime time;

    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    public void tick() {
        if (time.tick()) {
            date.advanceDay();
        }
    }

    public void print(boolean usFormat, String delimiter) {
        System.out.println(date.format(usFormat, delimiter) + " " + time.format(usFormat));
    }
}