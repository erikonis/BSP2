import java.util.Scanner;

public class Controller {
    
    private Scanner scanner = new Scanner(System.in);    
    private Action[] actions = new Action[10];
    private Maze maze = new Maze();
    private Robot robot = new Robot();

    public void control() //asks the user to input the 10 actions that will be added to the memory, check and executed
    {
        System.out.println("Please input the folowing actions : \n1.go Up\n2.go Down\n3.go Left\n4.go right\n5.Take high-res photo\n6.Take low-res photo\n7.Pick up rock\n\nPs: the robot's memory can only store 10 actions at a time\n");
        while(!maze.checkFinish()){
            for(int i=0;i<actions.length;i++)
            {
                int input = scanner.nextInt();
                while(!(0<input&&input<8))
                {
                    System.out.println("Invalid action, please input a valid one :");
                    input = scanner.nextInt();
                }
                
                switch(input)
                {
                    case 1:
                        actions[i]=Action.Up;
                        break;
                    case 2:
                        actions[i]=Action.Down;
                        break;
                    case 3:
                        actions[i]=Action.Left;
                        break;
                    case 4:
                        actions[i]=Action.Right;
                        break;
                    case 5:
                        actions[i]=Action.takePictureLowRes;
                        break;
                    case 6:
                        actions[i]=Action.takePictureHighRes;
                        break;
                    case 7:
                        actions[i]=Action.pickRock;
                        break;
                }

                System.out.println("The robot has memory for "+(actions.length-(i+1))+" more commands.");
            }

            if(checkActions()) //executes commands if every command is valid
                {
                    System.out.println("Every action is valid, executing actions...");
                    moveThroughMaze();
                    robot.executeActions(actions);
                    System.out.println("\n\nThe robot has memory for 10 more commands.");
                }
            else    {System.out.println("At least one of the actions wasn't valid, reseting memory...\n\nThe robot has memory for 10 more commands.");}

            actions = new Action[10];
        }
        scanner.close();
    }

    public boolean checkActions() //returns true if every action is valid
    {
        Maze tempMaze = new Maze();

        boolean valid = true;

        for(Action a: actions)
        {
            if(!tempMaze.move(a)&&valid) valid = false;;
        }

        return valid;
    }

    public void moveThroughMaze() //moves the robot through the maze
    {
        for(Action a: actions)
        {
            maze.move(a);
        }
    }
}
