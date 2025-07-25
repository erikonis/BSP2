package exercise1;

import java.util.List;

import java.util.ArrayList;

public class Controller{
    
    private int actionnumber=0;

    Robot robot;

    List<Action> actionList = new ArrayList<Action>();

    public Controller(Robot robot) {
        this.robot=robot;
    }

    public void report(){
        System.out.println("--------------------------------"+"\nRemaining battery life: "+robot.getBatterylife()+"\n");
    }

    public void goLeft(){
        if(actionnumber<10){
        ActionGoLeft agl=new ActionGoLeft();
        agl.decrire();
        actionList.add(agl);
        actionnumber++;}
    }

    public void goRight(){
        if(actionnumber<10){
        ActionGoRight agr=new ActionGoRight();
        agr.decrire();
        actionList.add(agr);
        actionnumber++;}
    }

    public void goForward(){
        if(actionnumber<10){
        ActionGoForward agf=new ActionGoForward();
        agf.decrire();
        actionList.add(agf);
        actionnumber++;}
    }

    public void goBack(){
        if(actionnumber<10){
        ActionGoBack agb=new ActionGoBack();
        agb.decrire();
        actionList.add(agb);
        actionnumber++;}
    }

    public void takePhoto(boolean HD){
        if(actionnumber<10){
        ActionTakePhoto atp=new ActionTakePhoto(HD);
        atp.decrire();
        actionList.add(atp);
        actionnumber++;}
    }

    public void pickRock(){
        if(actionnumber<10){
        ActionPickRock apr=new ActionPickRock();
        apr.decrire();
        actionList.add(apr);
        actionnumber++;}
    }

    public void sendToRobot(){
        for(Action action : actionList){
            int batterylife = action.execute(robot.getBatterylife());
            robot.setBatterylife(batterylife);
        }
        if(actionnumber==10){
            System.out.println("----"+"Maximum number of actions reached!"+"----\n");
        }
        
        report();
    }

    public void reset(){
        actionnumber=0;
        actionList.clear();
    }
}
