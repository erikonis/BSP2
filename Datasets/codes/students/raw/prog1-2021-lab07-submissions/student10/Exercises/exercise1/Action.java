package Exercises.exercise1;

public class  Action  {
   
    public String Forward()
    {
        return "Move Forward by 20 cm";
    }
    public String Left()
    {
        return "Move left by 20 cm.";
    }
    public String Right()
    {
        return "Move Right by 20 cm.";
    }
    public String Back()
    {
        return "Move Back by 20 cm.";
    }
    public String Rock()
    {
        return "Picked the rock.";
    }
    public String Photo(String Input)
    {
        String input="Took low resolution photo.";
        if(Input.equals("high"))
        {
            input="Took high resolution photo.";
        }
        return input;
    }
}
