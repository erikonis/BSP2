import java.util.ArrayList;
import java.util.List;

public class Controller {

    private Robot mars;
    private List<Action> actions;

    public Controller(Robot marsRobot) {
        this.setMars(marsRobot);
        this.setActions(new ArrayList<>());
    }

    public List<Action> getActions() {
        return actions;
    }

    // on doit toujours creer un getter et un setter car quand on change de classe
    // on ne peut plus utiliser l attribute lui meme sauf si il s agit une extension
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Robot getMars() {
        return mars;
    }

    public void setMars(Robot mars) {
        this.mars = mars;
    }

    public void executeAction(Action doIt) {
        if (this.actions.size() < 10) {
            this.mars.doAction(doIt);
            this.actions.add(doIt);
        } else {
            System.out.println("The number of actions is limited to 10");
        }

    }

    public void executeActions(List<Action> actions) {
        // for it s for a cycle
        for (Action action : actions) {
            this.executeAction(action);
        }
    }

    // override je veux changer quelque chose qui existe
    @Override
    public String toString() {
        return "Controlling: " + mars.toString() + "\n    Actions: " + actions + "\n      Total: " + actions.size();
    }
}
