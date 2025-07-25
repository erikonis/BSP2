public public class Main {
    public static void main(String[] args) {
        Date date = new Date(28, 2, 2024);
        Time time = new Time(23, 59, 58);
        DateTime dateTime = new DateTime(date, time);

        for (int i = 0; i < 5; i++) { // Simulate 5 seconds passing
            dateTime.tick();
            dateTime.print(true, "/");
        }
    }
}
 {

}