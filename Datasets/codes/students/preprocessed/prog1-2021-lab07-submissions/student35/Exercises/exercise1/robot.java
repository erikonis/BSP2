
public class robot
{
    private int batteryLife;
    private int distance;


    public robot()
    {
        batteryLife  =3000;
        distance =0;
    }

    public int getBatteryLife()
    {
        return batteryLife;
    }

    public int getDisctance()
    {
        return distance;
    }

    public void setBatteryLife(int consumption)
    {
        batteryLife -= consumption;
    }

    public void setDistance(int movement)
    {
        distance += movement;
    }

    public String print(String action, int used, int walked)
    {
        return "The robot has " + action + "\nIt used " + used + " batterytime.\nAnd moved " + walked + " cm.";
    }
}