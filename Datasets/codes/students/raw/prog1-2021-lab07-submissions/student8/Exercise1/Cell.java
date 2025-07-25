package Exercise1;

public class Cell {
    boolean wallUp,walldown,wallLeft,wallright;
    String element=" ";
    boolean isRobotIn;

    public Cell(boolean wallUp, boolean walldown, boolean wallLeft, boolean wallright, String element) {
        this.wallUp = wallUp;
        this.walldown = walldown;
        this.wallLeft = wallLeft;
        this.wallright = wallright;
        this.element = element;
    }

    public String lineTop(){
        if(wallUp)
            return "[]/[]";
        else 
            return "|   |";
       
    }

    public String lineMid(){
        Robot nullRobot = new Robot(0, 0, null, null);
        if(isRobotIn){
            if(wallLeft && wallright)
                return "] "+nullRobot.ch+" [";
            else if(wallLeft)
                return "] "+nullRobot.ch+"  ";
            else if(wallright)
                return "  "+nullRobot.ch+" [";
            else
                return "  "+nullRobot.ch+"  ";
        }
        else{
            if(wallLeft && wallright)
                return "] "+element+" [";
            else if(wallLeft)
                return "] "+element+"  ";
            else if(wallright)
                return "  "+element+" [";
            else
                return "  "+element+"  ";
        }
       
    }
    public String lineBottom(){
        if(walldown)
            return "[]/[]";
        else 
            return "|   |";
    }
    
}
