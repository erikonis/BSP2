import java.time.LocalDate;

public abstract class Action {
    
    private Character character;
    private static Logbook logbook = new Logbook();

    public Action(Character character) {
        this.character = character;
    }


    public abstract void execute();

    public Character getCharacter() {
        return character;
    }

    public void logSucceed(Action action) {
        logbook.logAction(action.toString());
        logbook.showLogs();
    }

    public void logFail(Character character) {
        logbook.logAction("\t" + LocalDate.now() + " : " + character.getName() + " could not perform action");
        logbook.showLogs();
    }

    public void kill(Character killedCharacter) {
        logbook.logKill(character, killedCharacter);
        logbook.showLogs();
    }

    public Logbook getLogbook() {
        return logbook;
    }

    @Override
    public String toString() {
        return "\t" + LocalDate.now() + " : Action executed: ";
    }

}
