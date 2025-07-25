public class TimeAdvancer {
    public Time advanceBySeconds(Time time, int seconds) {
        time.advance(seconds);
        return time;
    }
}