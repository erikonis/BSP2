
public class Robot {

    private int x,y, battery, numPhotos, numRocks;
    
    public Robot(){
        x = 70; //since each tile is 20 long and high, these coordinates 
        y = 10; //represent the robot's initial position in Figure
        battery = 3000;
        numPhotos = 0;
        numRocks = 0;
    }
    
    public int getNumPhotos() {
        return numPhotos;
    }

    public void setNumPhotos(int numPhotos) {
        this.numPhotos = numPhotos;
    }

    public int getNumRocks() {
        return numRocks;
    }

    public void setNumRocks(int numRocks) {
        this.numRocks = numRocks;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
