package exercise1;

public class ActionGoLeft extends Action{

    public ActionGoLeft() {
        super();
        setBatteryuse(10);
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
        System.out.println("Move left by 20 cm.");
        System.out.println("Battery consumption: "+getBatteryuse()+"\n");
    }
}
