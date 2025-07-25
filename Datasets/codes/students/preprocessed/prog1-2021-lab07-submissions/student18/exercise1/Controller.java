public class Controller {
    private Action[] arSetofAction;
    
    public Controller(){
        arSetofAction = new Action[10];
    }

    public void add(Action action){
        int i = 0;
        while(arSetofAction[i]!=null && i<10){
            i++;
        }
        if(arSetofAction[i]==null){
            arSetofAction[i]=action;
        }
        else{
            System.out.println("You cannot perform more than 10 actions successively !");
        }
    }

    public int getNumberOfActions(){
        int count = 0;
        while(count<10 && arSetofAction[count] != null){
            count++;
        }
        return count; 
    }

    public void runActions(Robot robot){
        int beforeBattery = robot.getBattery();

        int i = 0;
        while(i<10 && arSetofAction[i] != null){
            arSetofAction[i].runAction(robot);
            i++;
        }

        System.out.println("Number of actions performed : " + getNumberOfActions());
        System.out.println("Total battery usage : " + (beforeBattery-robot.getBattery()));
        System.out.println("Total battery left : " + robot.getBattery());

        arSetofAction = new Action[10];
    }

}
