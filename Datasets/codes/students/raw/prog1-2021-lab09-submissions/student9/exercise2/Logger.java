package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;

public abstract class Logger
{
    private static ArrayList<String> logger = new ArrayList<>();

    public static void add(String a)
    {
        logger.add(a);
    }

    public static String print()
    {
        String text ="";
        for (int i = 0; i < logger.size(); i++) {
            if(logger.get(i) != null)
            {
                text += logger.get(i) + "\n";
            }
        }
        return text;
    }
}
