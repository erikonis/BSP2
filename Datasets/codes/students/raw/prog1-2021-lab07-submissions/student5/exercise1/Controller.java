package lu.uni.programming1.lab7.exercise1;

public class Controller {
    private String actionToCreate;
    private String actionToDo;

    public Controller(String actionToCreate, String actionToDo) {
        this.actionToCreate = actionToCreate;
        this.actionToDo = actionToDo;
    }

    public String getActionToCreate() {
        return actionToCreate;
    }

    public void setActionToCreate(String actionToCreate) {
        this.actionToCreate = actionToCreate;
    }

    public String getActionToDo() {
        return actionToDo;
    }

    public void setActionToDo(String actionToDo) {
        this.actionToDo = actionToDo;
    }

    @Override
    public String toString() {
        return "Controller [actionToCreate=" + actionToCreate + ", actionToDo=" + actionToDo + "]";
    }

}
