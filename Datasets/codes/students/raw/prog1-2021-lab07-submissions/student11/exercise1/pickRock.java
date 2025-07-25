package lu.uni.programming1.lab7.exercise1;

public class pickRock extends Action{


    public void show()
    {
        System.out.println("Picked up a rock.");
        setBattery((getBattery()-150));
        System.out.println("Used 150 seconds of battery.");
    }

}
