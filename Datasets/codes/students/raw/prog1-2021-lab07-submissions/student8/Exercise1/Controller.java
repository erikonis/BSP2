package Exercise1;

public class Controller {

    Robot robot;

    public Controller(Robot robot) {
        this.robot = robot;
    }

    public void action(String... str) {

        int actions=0;

        for(int i=0;i<str.length;i++){

                String currentStr = str[i];
        
            if(currentStr=="forward" || currentStr=="backward" || currentStr=="left" || currentStr=="right" || currentStr=="photoLow" || currentStr=="photoHigh" || currentStr=="pick" ) 
            actions++;     
        }

        if(actions<=10){
            for(int i=0;i<str.length;i++){

                String currentStr = str[i];
    
            if(robot.batterie <= 0){
                robot.batterie=0;
                System.out.println("["+robot.name+"] will now foever stay on mars... ");
                break;
            } 
            else{
                
                int batterieBefore = robot.batterie;
                 if(currentStr=="forward"){
                    robot.forward();             
                }                
                else if(currentStr=="backward"){
                    robot.backwards();       
                }
                else if(currentStr=="left"){
                    robot.left();         
                }
                else if(currentStr=="right"){
                    robot.right();          
                }
                else if(currentStr=="photoLow"){
                    robot.takingLowResPhoto();            
                }
                else if(currentStr=="photoHigh"){
                    robot.takingHighResPhoto();               
                }
                else if(currentStr=="pick"){
                    robot.pickUpRock();
                }
                else
                System.out.println("Action Nbr.["+i+"] not found :"+currentStr); 

                if(robot.isEnd)
                    break;
                
                System.out.print("\t\t\t- "+(batterieBefore-robot.batterie)+" seconds\n");
                
               
            }
            }
            if(robot.batterie>0 && robot.isEnd==false){
                System.out.println(actions+" actions were done");
                System.out.println(robot.batterie+" seconds remain on the batterie");
            }
                
            
        }
        else
        System.out.println("|||You put more that 10 actions|||");

        
    }

    public static void main(String[] args) {
        Maze maze = new Maze();
        maze.createMaze();
        int startx=0,starty=0;

        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(maze.cellArray[i][j].element=="S"){
                    startx = i;
                    starty = j;
                    maze.cellArray[i][j].isRobotIn=true;
                    break;
                }
                    
        Robot robot = new Robot(startx, starty, "Wally", maze);
        Controller contr = new Controller(robot);
        maze.updateMaze();
        contr.action("forward", "right", "right", "photoHigh", "photoLow", "backward", "forward", "left");
        maze.updateMaze();      
        contr.action( "backward", "left", "forward", "left", "left", "backward", "right", "pick");
        maze.updateMaze();
        contr.action( "backward", "left", "forward", "left", "left", "backward", "right", "pick", "left", "forward", "left", "left", "backward", "right", "pick");
        maze.updateMaze();
        contr.action("left", "forward", "right", "forward", "left", "forward", "forward", "right","pick");
        maze.updateMaze();   
        contr.action("left", "backward", "backward", "right", "right", "right", "forward", "right", "forward", "left");
        maze.updateMaze();
        contr.action("left");
        maze.updateMaze();
    }
}
