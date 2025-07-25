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

    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    public void print(boolean usFormat, String delimiter) {
        System.out.println("Date: " + date.format(usFormat, delimiter) + ", Time: " + time.format(usFormat));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateTime dateTime = (DateTime) o;
        return Objects.equals(date, dateTime.date) && Objects.equals(time, dateTime.time);
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