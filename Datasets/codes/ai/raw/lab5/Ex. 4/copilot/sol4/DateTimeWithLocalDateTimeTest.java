package exercise4;

public class DateTimeWithLocalDateTimeTest {
    public static void main(String[] args) {
        DateWithLocalDate date = new DateWithLocalDate(28, 2, 2024);
        TimeWithLocalTime time = new TimeWithLocalTime(23, 59, 59);
        DateTimeWithLocalDateTime dateTime = new DateTimeWithLocalDateTime(date, time);

        dateTime.print(false, "-");
        dateTime.tick();
        dateTime.print(false, "-");
    }
}