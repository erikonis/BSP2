package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;
import java.util.List;

public interface Logs {
    List<String> logList = new ArrayList<String>();

    public void register(Character user, boolean executed);
    
}
