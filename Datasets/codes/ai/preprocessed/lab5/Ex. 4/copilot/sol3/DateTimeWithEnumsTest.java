public class DateTimeWithEnumsTest {
    public static void main(String[] args) {
        DateWithEnums date = new DateWithEnums(28, DateWithEnums.Month.FEBRUARY, 2024);
        TimeWithEnums time = new TimeWithEnums(23, 59, 59);
        DateTimeWithEnums dateTime = new DateTimeWithEnums(date, time);

        dateTime.print(false, "-");
        dateTime.tick();
        dateTime.print(false, "-");
    }
}