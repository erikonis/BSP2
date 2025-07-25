import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Logger {
    private static ArrayList<Action> actionList = new ArrayList<>();

    public static void add(Action action) {
        actionList.add(action);
    }

    public static void remove(int i) {
        actionList.remove(i);
    }

    public static void remove(Action action) {
        actionList.remove(action);
    }

    public static void clear() {
        actionList.clear();
    }

    public String toString() {
        String text = "";
        for (int i = 0; i < actionList.size(); i++) {
            String dateTime = LocalDate.now() + " " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()
                    + ":" + LocalTime.now().getSecond();

            text += "<" + dateTime + "> " + actionList.get(i).toString() + "\n";

            if (actionList.get(i).character.isPlayerDead()) {
                text += "<" + dateTime + "> " + actionList.get(i).character + " died.\n";
                actionList.get(i).character.revivePlayer();
            } else if (actionList.get(i) instanceof Targetable
                    && ((Targetable) actionList.get(i)).getTarget().isPlayerDead()) {
                text += "<" + dateTime + "> " + actionList.get(i).character + " killed "
                        + ((Targetable) actionList.get(i)).getTarget() + ".\n";
                ((Targetable) actionList.get(i)).getTarget()
                        .revivePlayer();
            }
        }
        return text;
    }
}
