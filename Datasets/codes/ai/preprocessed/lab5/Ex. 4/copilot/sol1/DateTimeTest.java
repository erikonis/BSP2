public class DateTimeTest {
    public static void main(String[] args) {
        Date date = new Date(28, 2, 2024);
        Time time = new Time(23, 59, 59);
        DateTime dateTime = new DateTime(date, time);

        dateTime.print(false, "-");
        dateTime.tick();
        dateTime.print(false, "-");
    }
}