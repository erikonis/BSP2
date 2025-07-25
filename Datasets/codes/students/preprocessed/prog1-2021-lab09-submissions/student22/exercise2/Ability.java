import java.time.LocalDate;

public class Ability implements Logs{
    String name;

    public Ability(String name) {
        this.name = name;
    }

    public void execute(Character user) {
        boolean executed = (user.getHealth() <= 0) ? false : true;
        register(user, executed);
    }

    @Override
    public void register(Character user, boolean executed) {
        String result = ""
        + String.format("Ability: %s / %s / user: %s / Action executed: %s",name,LocalDate.now(),user.getName(),executed);
        if (user.getHealth() <= 0) {
            result += String.format("\n%s has died", user.getName());
        }
        System.out.println(result);
        logList.add(result);
        
    }
}
