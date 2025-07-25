package Exercise4;

public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(31, 12, 2021);
        // d1.advance();
        // System.out.println(d1.format(false, "."));
        Time t1 = new Time(23, 59, 59);
        // t1.tick();
        // System.out.println(t1.format(false));
        // System.out.println(t1.secondsSinceMidnight());
        // System.out.println(t1.secondsUntilMidnight());
        DateTime dt1 = new DateTime(d1, t1);
        dt1.tick();
        dt1.format(false, ".");

    }

}
