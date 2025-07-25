public abstract class Action{

    private int cost;

    public Action(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isActionPossible(Robot robot){
        if(robot.getBattery()-cost >=0){
            return true;
        }
        else{
            System.out.println("The robot does not have enough battery to perform this action");
            return false;
        }
    }

    public void consumeBattery(Robot robot){
        robot.setBattery(robot.getBattery()-cost);
        System.out.println("This action consumed " + cost + " seconds of the battery");
    }

    public abstract void runAction(Robot robot);
}