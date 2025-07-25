import java.util.ArrayList;

public class Robot {
    // battery life
    private int batteryLife = 3000;
    // robert's position
    private int posX = 0, posY = 0;
    private ArrayList<Action> listOfActions = new ArrayList<>();
    private Maze maze = new Maze();

    public Robot() {
        this.posX = maze.getStartX();
        this.posY = maze.getStartY();
    }

    public void setListOfActions(ArrayList<Action> actions) {
        this.listOfActions = actions;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    // output
    public void run() {
        for (Action action : listOfActions) {
            action.performAction(this, maze);
        }
        System.out.println("-----------------------");
        System.out.println("Remaining battery life: " + batteryLife + " seconds");
    }
}
