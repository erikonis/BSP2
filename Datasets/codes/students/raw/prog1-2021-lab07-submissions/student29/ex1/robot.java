package ex1;

public class robot {
    static int battery;
    public robot(int battery){
        robot.battery=battery;
    }

    public int getBattery() {
        return battery;
    }
    public void left() {
        battery-=10;
        System.out.print("        R2D2----");
        System.out.println(battery);
    }
    public void right() {
        battery-=10;
        System.out.print("----R2D2        ");
        System.out.println(battery);
    }
    public void forward() {
        battery-=10;
        System.out.print("\n\nR2D2");
        System.out.println(battery);
    }
    public void back() {
        battery-=10;
        System.out.print("R2D2\n\n");
        System.out.println(battery);
    }

    
}