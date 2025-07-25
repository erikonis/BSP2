public class low extends takePhoto{

    public void show()
    {
        System.out.println("Took a low resolution photo.");
        setBattery(getBattery()-40);
        System.out.println("Used 40 seconds of battery.");
    }
    
}
