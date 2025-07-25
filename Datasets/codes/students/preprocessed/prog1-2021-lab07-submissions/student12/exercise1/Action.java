public abstract class Action{

    private int batteryuse;
    
    public Action(){
        
    }

    public int getBatteryuse() {
        return batteryuse;
    }

    public void setBatteryuse(int batteryuse) {
        this.batteryuse = batteryuse;
    }

    public abstract int execute(int batterylife);
    public abstract void decrire();

}
