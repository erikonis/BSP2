public class PickRock extends Action{
    
    @Override    
    void doAction(){
    cost=150;
    action="You picked up a rock";
    leftoverBattery=leftoverBattery-cost;
    System.out.println(action+" and you have taken "+cost+" seconds.");
    }

    public PickRock() {
    }
    
}
