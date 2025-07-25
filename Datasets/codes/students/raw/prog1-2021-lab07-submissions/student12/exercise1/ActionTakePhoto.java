package exercise1;

public class ActionTakePhoto extends Action{

    public ActionTakePhoto(boolean HD) {
        super();
        if( HD==true ){
            setBatteryuse(60);
        }else{
            setBatteryuse(40);
        }
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
    public void decrire(){

        if(getBatteryuse() == 60){
            System.out.println("Took high resolution photo.");
        }else{
            System.out.println("Took low resolution photo.");
        }
        System.out.println("Battery consumption: "+getBatteryuse()+"\n");
    }
 
}
