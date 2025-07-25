package Exercise1;

public class Robot {
    //attribues

    private int battery;
    private String Name;
    private int positionX;
    private int positionY;
    public Robot(String Name, int positionX, int positionY){
        this.Name = Name;
        this.positionX = positionX;
        this.positionY = positionY;
        battery = 3000;
    }

    public int getBattery() {
        return battery;
    }
    public void setBattery(int time){
        if(battery-time>=0)
        {
            battery -= time;
        }  
        else
        {
            if(battery == 0)
            {
                System.out.println("The battery of the robot is empty");
            }
            else
            {
                System.out.println("The robot has not enough battery left");
            }
        } 
    }
    public String getName(){
        return Name;
    }
    public int getPositionX(){
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    public void setPosition(int stepX, int stepY, int time){
        positionX += stepX;
        positionY += stepY;
        battery -= time;
    }
    
    
}
