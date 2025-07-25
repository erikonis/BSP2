public class Controller extends Action{
    public String[][] maze = new String[5][5];
    private int row = 0, col = 3;
    private Robot robot = new Robot(3000);
    private boolean end = false;
    private int counter = 10;

    public Controller(){
        maze[1][0] = "Stone";
        maze[3][0] = "Photo";
        maze[4][1] = "Finish";
    }

    public void action(int batteryUsage){
        counter--;
        robot.setBattery(robot.getBattery()-batteryUsage);
    }

    @Override
    public void goLeft() {
        if(col - 1 >= 0 && robot.getBattery() > 10 && counter > 0){
            col--;
            action(10);
            System.out.println("Moved Left\nBattery life: " + robot.getBattery() + "\n ---End of Action---");
        }else{
            System.out.println("Move not available");
        } 
    }

    @Override
    public void goRight() {
        if(col + 1 < 5 && robot.getBattery() > 10 && counter > 0){
            col++;
            action(10);
            System.out.println("Moved Right\nBattery life: " + robot.getBattery() + "\n ---End of Action---" );
        }else{
            System.out.println("Move not available");
        } 
        
    }

    @Override
    public void goUp() {
        if(row - 1 >= 0 && robot.getBattery() > 10 && counter > 0){
            row--;
            action(10);
            System.out.println("Moved Up\nBattery life: " + robot.getBattery() + "\n ---End of Action---" );
        }else{
            System.out.println("Move not available");
        } 
        
    }

    @Override
    public void goDown() {
        if(row + 1 < 5 && robot.getBattery() > 10 && counter > 0){
            row++;
            action(10);
            System.out.println("Moved Down\nBattery life: " + robot.getBattery() + "\n ---End of Action---");
        }else{
            System.out.println("Move not available");
        } 
        
    }

    @Override
    public void takeLowQPhoto() {
        if(maze[row][col].equals("Photo") && robot.getBattery() > 40 && counter > 0){
            action(40);
            System.out.println("Low Quality Alien Picture taken\nBattery life: " + robot.getBattery() + "\n ---End of Action---");
        }else{
            System.out.println("Can't take picture");
        }
        
    }

    @Override
    public void takeHighQPhoto() {
        if(maze[row][col].equals("Photo") && robot.getBattery() > 60 && counter > 0){
            action(60);
            System.out.println("High Quality Alien Picture taken\nBattery life: " + robot.getBattery() + "\n ---End of Action---");
        }else{
            System.out.println("Can't take picture");
        }
        
    }

    @Override
    public void pickRock() {
        if(maze[row][col].equals("Stone") && robot.getBattery() > 150 && counter > 0){
            action(150);
            System.out.println("Rock picked up\nBattery life: " + robot.getBattery() + "\n ---End of Action---");
        }else{
            System.out.println("Can't pickup rock");
        }
    }

    public boolean isEnd(){
        if(maze[row][col] != null && maze[row][col].equals("Finish")){
            end = true;
            System.out.println("Reached Finish");
        }else{
            System.out.println("Still somewhere in the maze");
        }
        return end;
    }
    
    
}