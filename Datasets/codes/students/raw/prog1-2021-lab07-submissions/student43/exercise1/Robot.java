package lu.uni.programming1.lab7.exercise1;

public class Robot extends CommandList {

private int battery;

public Robot() {
    this.battery = 3000;
}

public void MoveLeft() { battery -= 10;
    System.out.println("Moved Left 20cm.");}
public void MoveRight() { battery -= 10;
    System.out.println("Moved Right 20cm.");}
public void MoveUp() { battery -= 10;
    System.out.println("Moved Up 20cm.");}
public void MoveDown() { battery -= 10;
    System.out.println("Moved Down 20cm.");}

public void PickRock() { battery -= 150;
    System.out.println("Picked up Mars rock."); }

public void PhotoHigh() { battery -= 60;
    System.out.println("High resolution photo taken.");}
public void PhotoLow() { battery -= 40;
    System.out.println("Low resolution photo taken.");}

public int GetBattery() {
    return battery;
}
    
}
