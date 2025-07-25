import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateWithLocalDate {
    private LocalDate date;

    public DateWithLocalDate(int day, int month, int year) {
        this.date = LocalDate.of(year, month, day);
    }

    public boolean isLeapYear() {
        return date.isLeapYear();
    }

    public int daysInMonth() {
        return date.lengthOfMonth();
    }

    public void advance() {
        date = date.plusDays(1);
    }

    public String format(boolean us, String delimiter) {
        DateTimeFormatter formatter = us ? DateTimeFormatter.ofPattern("MM" + delimiter + "dd" + delimiter + "yyyy")
                                         : DateTimeFormatter.ofPattern("dd" + delimiter + "MM" + delimiter + "yyyy");
        return date.format(formatter);
    }
}