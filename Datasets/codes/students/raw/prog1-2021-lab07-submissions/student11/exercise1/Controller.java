package lu.uni.programming1.lab7.exercise1;

public class Controller {

    public Controller(Action[] set)
    {
        for (int i = 0; i < set.length; i++)
        {
            set[i].show();
        }
        System.out.println("Performed " + set.length + " actions.");
    }
    
}
