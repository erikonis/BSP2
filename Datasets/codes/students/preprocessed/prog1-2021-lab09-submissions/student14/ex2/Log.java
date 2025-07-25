import java.util.ArrayList;

public abstract class Log {
    // to log
    // arraylist
    private static ArrayList<String> log = new ArrayList<String>();

    public static void add(String msg) {
        log.add(msg);
    }

    @Override
    public String toString() {
        return "Log []";
    }

    // print text
    public static String printText() {
        String text = "";
        for (int s = 0; s < log.size(); s++) {
            if (log.get(s) != null) {
                text += log.get(s) + "\n";
            }
        }
        return text;
    }

}