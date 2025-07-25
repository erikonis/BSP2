public class TimeValidator {
    public static boolean isValidFormat(String format) {
        return format.equals("12-hour") || format.equals("24-hour");
    }

    public static boolean isValidHour(int hour, String format) {
        if (format.equals("12-hour")) {
            return hour >= 1 && hour <= 12;
        } else if (format.equals("24-hour")) {
            return hour >= 0 && hour <= 23;
        }
        return false;
    }

    public static boolean isValidMinute(int minute) {
        return minute >= 0 && minute <= 59;
    }

    public static boolean isValidSecond(int second) {
        return second >= 0 && second <= 59;
    }
}