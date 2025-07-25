public class high extends takePhoto{

    public void show()
    {
        System.out.println("Took a high resolution photo.");
        setBattery(getBattery()-60);
        System.out.println("Used 60 seconds of battery.");
    }
    
}
