public class TimeValidator {
    public static boolean isValidTime(int hours, int minutes, int seconds, int format) {
        if (hours < 0 || hours >= (format == 12 ? 12 : 24) || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            return false;
        }
        return true;
    }
}
