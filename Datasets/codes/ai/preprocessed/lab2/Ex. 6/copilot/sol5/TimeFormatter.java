public class TimeFormatter {
    public static String formatTime(Time time) {
        String formattedTime = String.format("%02d:%02d:%02d", time.getHours(), time.getMinutes(), time.getSeconds());
        if (time.getFormat() == 12) {
            formattedTime += " " + time.getPeriod();
        }
        return formattedTime;
    }
}