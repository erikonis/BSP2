public class Robot {
    private int battery = 3000;

    public void executeActions(Action[] actions)
    {
        for(Action x:actions)
        {
            switch (x)
            {
                case Up:
                    battery -= 10;
                    break;
                case Down:
                    battery -= 10;
                    break;
                case Left:
                    battery -= 10;
                    break;
                case Right:
                    battery -= 10;
                    break;
                case takePictureLowRes:
                    battery -= 40;
                    break;
                case takePictureHighRes:
                    battery -= 60;
                    break;
                case pickRock:
                    battery -= 150;
                    break;
                default:
                    break;
            }
        }
        System.out.println(toString(actions));
    }

    public String toString(Action[] actions)
    {
        String output="\nThe following actions will be executed :";
        for(Action x:actions)
        {
            switch(x)
            {
                case Up:
                    output+="\nMove up by 20 cm.";
                    break;
                case Down:
                    output+="\nMove down by 20 cm.";
                    break;
                case Left:
                    output+="\nMove left by 20 cm.";
                    break;
                case Right:
                    output+="\nMove right by 20 cm.";
                    break;
                case pickRock:
                    output+="\nPicked up a rock.";
                case takePictureHighRes:
                    output+="\nTook a High-Res photo.";
                case takePictureLowRes:
                    output+="\nTook a Low-Res photo.";
                default:
                    break;
            }
        }
        output+="\n----------------------------------\nRemaining battery life: "+battery+" seconds";
        return output;
    }
}
