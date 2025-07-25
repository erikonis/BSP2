import java.util.Objects;

public class DateTime {
    private Date date;
    private Time time;

    public DateTime(Date date, Time time) {
        this.date = Objects.requireNonNull(date, "Date cannot be null");
        this.time = Objects.requireNonNull(time, "Time cannot be null");
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public DateTime tick() {
        Time newTime = time.tick();
        Date newDate = date;
        if (!newTime.equals(time) && newTime.getHours() == 0 && newTime.getMinutes() == 0 && newTime.getSeconds() == 0) {
            newDate = date.advance();
        }
        return new DateTime(newDate, newTime);
    }

    public void print(boolean usFormat, String delimiter) {
        System.out.println("Date: " + date.format(usFormat, delimiter) + ", Time: " + time.format(usFormat));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateTime other = (DateTime) o;
        return Objects.equals(date, other.date) && Objects.equals(time, other.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time);
    }

    @Override
    public String toString() {
        return "DateTime {date=" + date + ", time=" + time + "}";
    }
}