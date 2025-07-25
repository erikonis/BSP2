public class ActionGoForward extends Action{
    
    public ActionGoForward() {
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
        System.out.println("Move forward by 20 cm.");
        System.out.println("Battery consumption: "+getBatteryuse()+"\n");
    }
}
