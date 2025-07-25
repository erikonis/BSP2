public class TimeOperations {
    public static String formatTime(int hour, int minute, int second) {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static int[] advanceTime(int hour, int minute, int second) {
        second += 5; // Advance by 5 seconds
        if (second >= 60) {
            second -= 60;
            minute++;
        }

        if (minute >= 60) {
            minute -= 60;
            hour++;
        }

        if (hour >= 24) {
            hour -= 24; // for 24-hour format time overflow
        }

        return new int[] { hour, minute, second };
    }
}