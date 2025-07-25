public class Go extends Action{

    public void Go()
    {
        setBattery(getBattery()-10);
        System.out.println("Used 10 seconds of battery.");
    }

    
    public void show() {
    }

}
