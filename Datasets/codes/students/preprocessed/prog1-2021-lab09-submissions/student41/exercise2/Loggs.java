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
