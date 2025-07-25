package lu.uni.programming1.lab9.Exercise2;

public class Jump implements Actions {

    private String action = "";

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Jump() {
    }

    @Override
    public void execute(Character c, Logs logs) {

        if (c.getCurrentHealth() > 0) {
            action = c.getName() + " jumped.\n";
            logs.add(action);
        } else {
            action = "Action cannot be executed because " + c.getName() + " has died.\n";
            logs.add(action);
        }

    }

}
