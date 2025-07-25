public class DateTime {
    private static Date date;
    private static Time time;

    public DateTime(Date date, Time time) {
        DateTime.date = date;
        DateTime.time = time;
    }

    public static void tick() {
        if (Time.tick()) {
            Date.advance();
        }
    }

    public static void print(boolean us, String delimiter) {
        System.out.println(Date.format(us, delimiter) + " " + Time.format(us));
    }
}