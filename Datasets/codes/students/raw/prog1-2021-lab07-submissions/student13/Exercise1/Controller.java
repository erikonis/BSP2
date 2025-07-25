package Exercise1;

public class Controller extends Action{

    private String[][] maze= new String[5][5];
    private boolean missionPhoto, missionRock;
    private Robot r;
    private int row, column;
    private int moves;

    public Controller() 
    {
        maze[1][0]="Rock";
        maze[3][0]="Alien";
        r= new Robot();
        row=0;
        column=3;
        moves=0;
        missionPhoto=false;
        missionRock=false;
    }

    public void goForward()
    {
        if(!checkmoves() && r.getBatteryLife()>=10 && row <= 3)
        {
            row++;
            moves++;
            r.setBatteryLife(r.getBatteryLife()-10);
            System.out.println("Robot went forward");
            System.out.println("Robot lost 10 seconds of batterytime");
            System.out.println("-------------------------------");
        }
    }

    public void goBack()
    {
        if(!checkmoves() && r.getBatteryLife()>=10 && row >= 1)
        {
            row--;
            moves++;
            r.setBatteryLife(r.getBatteryLife()-10);
            System.out.println("Robot went backwards");
            System.out.println("Robot lost 10 seconds of batterytime");
            System.out.println("-------------------------------");
        }
    }

    public void goLeft()
    {
        if(!checkmoves() && r.getBatteryLife()>=10 && column >= 1)
        {
            column--;
            moves++;
            r.setBatteryLife(r.getBatteryLife()-10);
            System.out.println("Robot went left");
            System.out.println("Robot lost 10 seconds of batterytime");
            System.out.println("-------------------------------");
        }
        
    }

    public void goRight()
    {
        if(!checkmoves() && r.getBatteryLife()>=10 && column <= 3)
        {
            column++;
            moves++;
            r.setBatteryLife(r.getBatteryLife()-10);
            System.out.println("Robot went right");
            System.out.println("Robot lost 10 seconds of batterytime");
            System.out.println("-------------------------------");
        }
        
    }

    public void takePhoto(boolean res)
    {
        if(res && maze[row][column]=="Alien")
        {
            r.setBatteryLife(r.getBatteryLife()-60);
            System.out.println("Robot took high-res photo.");
            System.out.println("Robot lost 60 seconds of batterytime");
            System.out.println("-------------------------------");
            missionPhoto=true;
        }
        else if(!res && maze[row][column]=="Alien")
        {
            r.setBatteryLife(r.getBatteryLife()-40);
            System.out.println("Robot took low-res photo.");
            System.out.println("Robot lost 40 seconds of batterytime");
            System.out.println("-------------------------------");
            missionPhoto=true;
        }
    }

    public void pickRock()
    {
        if(maze[row][column]=="Rock")
        {
            r.setBatteryLife(r.getBatteryLife()-150);
            System.out.println("Robot picked up rock.");
            System.out.println("Robot lost 150 seconds of batterytime");
            System.out.println("-------------------------------");
            missionRock=true;
        }
    }

    public boolean checkmoves()
    {
        if(moves==10)
        {
            System.out.println("Every move used");
            System.out.println("Number of actions: " + moves);
            System.out.println("Remaining Battery: " + r.getBatteryLife());
            return true;
        }
        if(missionPhoto && missionRock && row==4 && column==1)
        {
            System.out.println("Mission accomplished!");
            return true;
        }
        return false;
    }

    public void actionSequence(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10)
    {
        action(a1);
        action(a2);
        action(a3);
        action(a4);
        action(a5);
        action(a6);
        action(a7);
        action(a8);
        action(a9);
        action(a10);
    }

    public void action(String action)
    {
        switch(action)
        {
            case "forward":
                goForward();
                checkmoves();
            break;
            case "back":
                goBack();
                checkmoves();
            break;
            case "left":
                goLeft();
                checkmoves();
            break;
            case "right":
                goRight();
                checkmoves();
            break;
            case "high":
                takePhoto(true);
            break;
            case "low":
                takePhoto(false);
            break;
            case "pickRock":
                pickRock();
            break;
            default:
                System.out.println("Something went wrong");
            break;
        }
    }

    public void newAction()
    {
        
    }
}
