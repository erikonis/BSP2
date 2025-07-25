package exercise1;

public class ActionPickRock extends Action{

    public ActionPickRock() {
        super();
        setBatteryuse(150);
    }

    @Override
    public int execute(int batterylife) {
        
        if(batterylife>getBatteryuse()){
            return batterylife-getBatteryuse();
        }else{
            return batterylife;
        }

    }

    @Override
    public void decrire() {
        System.out.println("Picked the rock.");
        System.out.println("Battery consumption: "+getBatteryuse()+"\n");
    }
    
}
