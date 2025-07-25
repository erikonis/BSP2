package lab7.exercise1;

public class Maze {
    
    private MazeSquare[] maze = new MazeSquare[25]; 

    private int position = -1;

    private boolean pickedRock = false;
    private boolean photoTaken = false;

    public Maze()
    {
        for(int i = 0; i<maze.length;i++){maze[i] = new MazeSquare(i+1);} //adds 25 squares to the maze
    }

    public boolean checkboundaries(int square1, int square2) //checks if the robot can go from square1 to square2 otherwise returns false;
    {
        int[] list1 = {4,4,3,2,6,8 ,9 ,10,12,13,15,24,18,23,17,21};
        int[] list2 = {5,9,8,7,7,13,14,15,17,18,20,25,19,24,22,22};

        for(int i=0;i<list1.length;i++)
        {
            if((list1[i]==square1&&list2[i]==square2)||(list1[i]==square2&&list2[i]==square1)) return true;
        }

        return false;
    }

    public boolean move(Action action) //moves the robot by checking wether the robot can move on that direction
    {
        switch(action)
        {
            case Up:
                int tempUp = position-5;
                if(((tempUp==-1||(tempUp)>0))&&!checkboundaries(position, tempUp)) {position -=5;return true;}
                break;
            case Down:
                int tempDown = position+5;
                if((tempDown==27||((tempDown)<26))&&!checkboundaries(position, tempDown)) {position +=5;return true;}
                break;
            case Left:
                int tempL = position-1;
                if(!(tempL==0||tempL==5||tempL==10||tempL==15||tempL==20)&&!checkboundaries(position, tempL)) {position = tempL;return true;}
                break;
            case Right:
                int tempR = position+1;
                if(!(tempR==6||tempR==11||tempR==16||tempR==21||tempR==26)&&!checkboundaries(position, tempR)) {position = tempR;return true;}
                break;
            case pickRock:
                if(position==6)  pickedRock = true;
            case takePictureHighRes:
                if(position==16) photoTaken = true;
            case takePictureLowRes:
                if(position==16) photoTaken = true;
            default:
                break;
        }
        return false;
    }

    public boolean checkFinish()
    {
        if(position==22) {System.out.println("Congratulations, the robot reached the end of the maze");return true;}
        else return false;
    }
}
