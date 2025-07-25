public class Main {
    public static void main(String[] args) {
        // Create Date and Time objects
        Date date = new Date(31, 12, 2024);
        Time time = new Time(23, 59, 59);

        // Create DateTime object
        DateTime dateTime = new DateTime(date, time);

        // Print initial date and time
        dateTime.print(false, "-");

        // Advance time by one second
        dateTime.tick();

        // Print updated date and time
        dateTime.print(false, "-");
    }
}
