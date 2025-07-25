package Exercise1;

public class Robot {

    int x,y;
    int nmbRocks;
    int batterie;
    int highResPhoto;
    int lowResPhoto;
    String ch="⌘";
    String name;
    Maze maze;
    boolean isEnd;

    public Robot(int x, int y,String name,Maze maze) {
        this.x = x;
        this.y = y;
        this.name =  name;
        this.maze = maze;
        nmbRocks=0;
        batterie=3000;
        highResPhoto=0;
        lowResPhoto=0;
    }
    public void checkElement() {
        if(maze.cellArray[x][y].element=="ค"){
            System.out.println("\t-an alien ran away");
            maze.cellArray[x][y].element=" ";
        }

        if(maze.cellArray[x][y].element=="E")
            end();
    }

    public void forward() {
        if(maze.cellArray[x][y].walldown)
            System.out.println("Outch! The robot ["+name+"] bumped into a wall");
        else{
            maze.cellArray[x][y].isRobotIn=false;
            y++;
            maze.cellArray[x][y].isRobotIn=true;

            System.out.println("["+name+"] went forward");

            checkElement();
        }
           
        batterie = batterie - 10;             //the robot looses energie if he run into the wall or goes in any direction
    }
    public void backwards() {
        if(maze.cellArray[x][y].wallUp)
            System.out.println("Outch! The robot ["+name+"] bumped into a wall");
        else{
            maze.cellArray[x][y].isRobotIn=false;
            y--;
            maze.cellArray[x][y].isRobotIn=true;

            System.out.println("["+name+"] went backwards");
            
            checkElement();
        }
            
        batterie -= 10;
    }
    public void left() {
        if(maze.cellArray[x][y].wallLeft)
            System.out.println("Outch! ["+name+"] bumped into a wall");
        else{
            maze.cellArray[x][y].isRobotIn=false;
            x--;
            maze.cellArray[x][y].isRobotIn=true;

            System.out.println("["+name+"] went left");
            
            checkElement();
        }
            
        batterie -= 10;
    }
    public void right() {
        if(maze.cellArray[x][y].wallright)
            System.out.println("Outch! The robot ["+name+"] bumped into a wall");
        else{
            maze.cellArray[x][y].isRobotIn=false;
            x++;
            maze.cellArray[x][y].isRobotIn=true;

            System.out.println("["+name+"] went right");

            checkElement();
        }
            
        batterie -= 10;
    }

    public void pickUpRock() {
        if(maze.cellArray[x][y].element=="*"){
            nmbRocks++;
            batterie -= 150;
            System.out.println("["+name+"] picked up THE ROCK");
            maze.cellArray[x][y].element=" ";
        }
        else
            System.out.println("no rock here to pick up (he is cooking)");
            
    }

    public void takingHighResPhoto() {
        if(x!=4 && maze.cellArray[x+1][y].element=="ค" || x!=0 && maze.cellArray[x-1][y].element=="ค" || y!=4 && maze.cellArray[x][y+1].element=="ค" || y!=0 && maze.cellArray[x][y-1].element=="ค"){
            highResPhoto++;
            batterie -= 60;
            System.out.println("["+name+"] took a high resolution photo");
        }
        else
            System.out.println("Sadly ["+name+"] doesn´t see any aliens around");
    }

    public void takingLowResPhoto() {
        if(x!=4 && maze.cellArray[x+1][y].element=="ค" || x!=0 && maze.cellArray[x-1][y].element=="ค" || y!=4 && maze.cellArray[x][y+1].element=="ค" || y!=0 && maze.cellArray[x][y-1].element=="ค"){
            lowResPhoto++;
            batterie -= 40;
            System.out.println("["+name+"] took a Low resolution photo");
        }
        else
            System.out.println("Sadly ["+name+"] doesn´t see any aliens around");
    }

    public void end() {
        int score = 150*nmbRocks+60*highResPhoto+40*lowResPhoto;
        System.out.println("Congratulation !!! ["+name+"] will come home safly and with important research");
        System.out.println(nmbRocks+" Rock(s) from MARS!");
        System.out.println((highResPhoto+lowResPhoto)+" photo(s) from an alien");
        System.out.println("\t-"+highResPhoto+" high resolution photo(s)");
        System.out.println("\t-"+highResPhoto+" low resolution photo(s)");
        System.out.println("Total score for ["+name+"] is "+score);
        isEnd = true;
        
    }

    
    
}
