package lu.uni.programming1.lab5.exercise4;

public class DateTime {
    
    private Date date;

    private Time time;

    public void tick() {
        if (time.tick()) {
            date.advance();
        }
    }

    public void print(boolean us, String delimiter) {
        System.out.println("The current time is:\n" + date.format(us, delimiter) + "\n" + time.format(us));
    }

    public Time getTime() {
        return time;
    }

    DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }
}
