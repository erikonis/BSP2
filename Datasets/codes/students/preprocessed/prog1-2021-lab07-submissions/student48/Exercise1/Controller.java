import java.util.Scanner;

public class Controller {
    public Controller(){
    }
    Scanner scan = new Scanner(System.in);
    MoveBackwards mB = new MoveBackwards();
    MoveForwards mF = new MoveForwards();
    MoveLeft mL = new MoveLeft();
    MoveRight mR = new MoveRight();
    PickRock pR = new PickRock();
    TakeHighResolutionPic thrp = new TakeHighResolutionPic();
    TakeLowResolutionPic thlp = new TakeLowResolutionPic();

    void goForwards(){
        mF.doAction();
    }
    void goBackwards(){
        mB.doAction();
    }
    void goLeft(){
        mL.doAction();
    }
    void goRight(){
        mR.doAction();
    }
    void pickRock(){
        pR.doAction();
    }
    void takeHighResPic(){
        thrp.doAction();
    }
    void takeLowResPic(){
        thlp.doAction();
    }
    void sendToRobot(){
        
    }
}
