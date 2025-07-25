package Exercises.exercise1;

public class MainClass 
{
    public static void main(String[] args) {

        ActionArray r = new ActionArray();
        r.action("s");
        r.action("s");
        r.action("s");
        r.takeRock();
        r.action("d");
        r.action("s");
        r.picture(false);
        r.action("d");
        r.action("d");
        r.action("s");
        r.picture(true);
    }
}
