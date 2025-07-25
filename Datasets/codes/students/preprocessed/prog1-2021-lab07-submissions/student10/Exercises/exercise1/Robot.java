import java.util.ArrayList;

public class Robot {
    int batterylife=3000;
    ArrayList<String>aList = new ArrayList<>();

    public void addcommand(String input)
    {
        if(aList.size()<11)
        {
            aList.add(input);
        }
        
        
    }

    public void report()
    {
        if(aList.size()==10)
        {
            System.out.println("maximum number of actions reached, cannot accept more");
            for(int i=0 ;i<aList.size();i++)
            {
                System.out.println(aList.get(i));
            }
            System.out.println("-----------------------");
            System.out.println("Ramining battery life: "+batterylife+" seconds"+System.lineSeparator());
        }
        else
        {
            for(int i=0 ;i<aList.size();i++)
            {
                System.out.println(aList.get(i));
            }
            System.out.println("-----------------------");
            System.out.println("Ramining battery life: "+batterylife+" seconds"+System.lineSeparator());
        }
        aList.clear();
    }


}
