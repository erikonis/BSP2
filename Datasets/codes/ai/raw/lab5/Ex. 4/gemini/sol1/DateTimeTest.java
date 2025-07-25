public package datetime;

public class DateTimeTest {
    public static void main(Stringargs) {
        DateTime dt = new DateTime(31, 12, 2023, 23, 59, 58);

        for (int i = 0; i < 5; i++) {
            dt.print(false, "-");
            dt.tick();
        }

        DateTime dtUs = new DateTime(1, 1, 2024, 11, 59, 58);

        for (int i = 0; i < 5; i++) {
            dtUs.print(true, "/");
            dtUs.tick();
        }
    }
}