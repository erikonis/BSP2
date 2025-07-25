public class TimeFormatter {
    public static String formatTime(int hour, int minute, int second) {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void advanceTime(int[] time) {
        // Advance by 5 seconds
        time[2] += 5;

        // Handle overflow of seconds
        if (time[2] >= 60) {
            time[2] -= 60;
            time[1] += 1;
        }

        // Handle overflow of minutes
        if (time[1] >= 60) {
            time[1] -= 60;
            time[0] += 1;
        }

        // Handle overflow of hours for 24-hour format
        if (time[0] >= 24) {
            time[0] -= 24;
        }
    }
}
