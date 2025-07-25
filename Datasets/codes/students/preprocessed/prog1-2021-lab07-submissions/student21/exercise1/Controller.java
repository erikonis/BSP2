public class Controller {

    private int battery = 3000;
    private String interacted;
    private Action[] actions = new Action[10];

    public void emptyList() {
        for (int i = 0; i < 10; i++) {
            actions[i] = new Action("", 0);
        }
    }

    public String getInteracted() {
        return interacted;
    }

    public void setInteracted(String interaction) {
        this.interacted = interaction;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public Action[] getActions() {
        return actions;
    }

    public void setOfActions(Move move, Interaction interaction) {
        for (int i = 0; i < 10; i++) {
            if (interacted.equals("move")) {
                if (actions[i].getAction().equals("")) {
                    actions[i] = move;
                    i = 20;
                }
            } else if (interacted.equals("interact")) {
                if (actions[i].getAction().equals("")) {
                    actions[i] = interaction;
                    i = 20;
                }
            }

        }
    }

    public String getSetOfActions(int currentAction) {
        return actions[currentAction].toString();

    }
}