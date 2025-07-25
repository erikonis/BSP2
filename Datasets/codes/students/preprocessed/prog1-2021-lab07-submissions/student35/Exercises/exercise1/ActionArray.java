public class ActionArray extends robot{
    private String[] arCommand;
    private int space;
    private boolean stop;

    public ActionArray()
    {
        arCommand = new String[10];
        space =0;
        stop = false;
    }

    private void add(String move, int consumption, String action, int walked)
    {
        int battery = super.getBatteryLife();
        if(!stop)
        {
            if(space < arCommand.length && battery - consumption >=0)
            {
                arCommand[space] = move;
                space++;
                setBatteryLife(consumption);
                setDistance(walked);
                System.out.println(print(action, consumption, walked));
                System.out.println("----------------------");
            }
            else
            {
                System.out.println(done());
                stop = true;
            }
        }
    }

    public void picture(boolean normal)
    {
        if(normal)
        {
            add("normalPicture", 40, "taken a normal picture!", 0);
            return;
        }
        add("betterPicture", 60, "taken a GOOD picture!", 0);
    }
    
    public void takeRock()
    {
        add("takeRock", 150, "aquired a Rock!", 0);
    }

    public void action(String dir)
    {
        String move = "";
        String action = "";
        boolean knownAction = true;

        switch(dir)
        {
            case "w":
            move = "up";
            action = "moved up!";
            break;
            case "a":
            move = "left";
            action = "moved to the left";
            break;
            case "s":
            move = "down";
            action = "moved down!";
            break;
            case "d":
            move = "right";
            action = "moved to the right";
            break;
            default:
            knownAction = false;
            break;
        }

        if(knownAction)
        {
            add(move, 10, action, 20);
        }
        else
        {
            System.out.println("This is not an action the robot knows!");
        }
    }

    private String done()
    {
        return "The robot did " + space + " actions and has a total of "  + getBatteryLife()
        + " batterytime left. They moved " + getDisctance() + " cm.";
    }
}
