package lu.uni.programming1.lab9.exercise2;

import java.util.ArrayList;

public class Loggs {

    ArrayList<String> alList = new ArrayList<>();

    @Override
    public String toString(){
        String text = "";
        for(int i=0; i<alList.size(); i++){
            text += "\n " + alList.get(i);
        }
        return text;
    }
}
