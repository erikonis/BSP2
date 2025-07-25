public class DateTime {
    private Date d;
    private Time t;

    DateTime(Date d, Time t) {
        this.d = d;
        this.t = t;
    }

    public void tick() {
        if (t.tick())
            d.advance();
    }

    public void format(boolean us, String delimiter) {
        String date = d.format(us, delimiter);
        String time = t.format(us);
        System.out.println("Now is " + time + " " + date);

    }
}
