import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Controller c = new Controller();
        System.out.println("Who do you want to call your robot?: ");
        Scanner scanner = new Scanner(System.in);
        //The place 0,7 is where the robot start on the labsheet
        String Name = scanner.next();
        Robot r = new Robot(Name,0,7);
        String N = r.getName().substring(0,1).toUpperCase();
        c.maze[0][7]= N;
        c.printMaze();
        Move m = new Move();
        r.setPosition(r.getPositionX(),m.goFoward(), m.getNeededTime());
        r.setPosition(m.goLeft(), r.getPositionY(), m.getNeededTime());
        r.setPosition(m.goLeft(), r.getPositionY(), m.getNeededTime());
        r.setPosition(m.goLeft(), r.getPositionY(), m.getNeededTime());
        Doing d = new Doing();
        d.Do(Name, "pickUp");
        r.setBattery(d.getNeededTime());
        //Rock is no longer there
        c.maze[3][1] = " " ;
        r.setPosition(r.getPositionX(),m.goFoward(), m.getNeededTime());
        r.setPosition(r.getPositionX(),m.goFoward(), m.getNeededTime());
        r.setPosition(r.getPositionX(),m.goFoward(), m.getNeededTime());
        d.Do(Name, "photoH");
        r.setBattery(d.getNeededTime());
        //Took the photo;
        c.maze[7][1] = " ";
        r.setPosition(m.goRight(), r.getPositionY(), m.getNeededTime());
        r.setPosition(m.goRight(), r.getPositionY(), m.getNeededTime());
        r.setPosition(r.getPositionX(),m.goFoward(), m.getNeededTime());
        r.setPosition(m.goLeft(), r.getPositionY(), m.getNeededTime());
        c.maze[0][7]= " ";
        c.maze[10][3]= N;
        c.printMaze();
        System.out.println("My battery level is: " + r.getBattery());
                
        //close
        scanner.close();
        
    }

    //Maze  
    private String maze[][];
    private int mazeSize = 11;
    
    public Controller(){
        maze = new String[11][11];
        for(int i = 0; i<mazeSize; i++){
            maze[i][0] = "|";
            maze[i][10] = "|";
            //0
            if(i!=7){
                maze[0][i] = "-";
            }
            //10
            if(i!= 3){
                maze[10][i] ="-";
            }
        }
        //1
        maze[1][8] = "|";
        //2
        for(int i = 2; i<=8;i++){
        maze[2][i] = "-";
        }
        //3 R means Rock
        maze[3][1] = "R";
        maze[3][2] = "|";
        //4
        maze[4][2] = "|";
        for(int i = 4; i<=9; i++){
            maze[4][i] = "-";
        }
        //5 nothing here
        //6
        for(int i = 2; i<=9;i++){
            if(i!=7){
                maze[6][i] = "-";
            }
        }
        //7 C means Camera and represent the place where you take the picture
        maze[7][1] = "C";
        maze[7][6] = "|";
        //8
        maze[8][2] = "-";
        maze[8][3] = "-";
        maze[8][4] = "-";
        maze[8][6] = "|";
        maze[8][8] = "|";
        //9 A means Alien
        maze[9][1] = "A";
        maze[9][2] = "|";
        maze[9][6] = "|";
        maze[9][8] = "|";

        //for the reste
        for(int i = 0; i <mazeSize;i++){
            for (int j = 0; j < mazeSize; j++) {
                if(maze[i][j] == null){
                    maze[i][j] = " ";
                }
            }
        }
        //corners
        maze[0][0] = "•";
        maze[10][10] = "•";
        maze[0][10] = "•";
        maze[10][0] = "•";
        maze[0][8] = "•"; 
        maze[2][2] ="•";
        maze[2][8] = "•";
        maze[4][2] = "•";
        maze[6][2] = "•";
        maze[6][6] = "•";
        maze[8][2] = "•";
        maze[8][4] = "•";
        maze[8][8] = "•";
        maze[10][2] = "•";
        maze[10][6] = "•";
        maze[10][8] = "•";
       
    }
    
    public void toStingLine(int line)
    {
        String Line = "";
        for(int i = 0; i<mazeSize; i++){
            Line += maze[line][i] + " ";
        }
        System.out.println(Line);
    }
    public void printMaze(){
        System.out.println("The maze looks like: \n");
        for(int i = 0 ; i<11;i++)
        {
            toStingLine(i);
        }
    }
    
}
