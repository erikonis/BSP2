import java.util.ArrayList;

public class Controller {
    private Robot robot;
    // only 10 commands possible
    // arraylist
    private ArrayList<Action> listOfActions;
    private int maxNumberOfActions = 10;

    // constructor
    public Controller(Robot robot) {
        this.robot = robot;
        this.listOfActions = new ArrayList<>();
    }

    // differnent move commands
    // goBack, goForward, ...
    public void goBack() {
        if (maxNumberOfActions != 0) {
            listOfActions.add(new Back());
            maxNumberOfActions--;
        }
    }

    public void goForward() {
        if (maxNumberOfActions != 0) {
            listOfActions.add(new Forward());
            maxNumberOfActions--;
        }
    }

    public void goLeft() {
        if (maxNumberOfActions != 0) {
            listOfActions.add(new Left());
            maxNumberOfActions--;
        }
    }

    public void goRight() {
        if (maxNumberOfActions != 0) {
            listOfActions.add(new Right());
            maxNumberOfActions--;
        }
    }

    public void pickRock() {
        if (maxNumberOfActions != 0) {
            listOfActions.add(new Pick());
            maxNumberOfActions--;
        }
    }

    // check if the photo is a high or low resultion photo
    public void takePhoto(boolean highRes) {
        if (maxNumberOfActions != 0) {
            if (highRes) {
                listOfActions.add(new Photo(true));
            } else {
                listOfActions.add(new Photo(false));
            }
            maxNumberOfActions--;
        }
    }

    public void sendToRobot() {
        robot.setListOfActions(listOfActions);
        robot.run();
    }

    // after 10 commands
    // clear
    public void reset() {
        listOfActions.clear();
        maxNumberOfActions = 10;
    }
}
