package Exercise1;

public class Action {

    private String command;
    private int time;


    public Action(String nom, int temps) {
        this.command = nom;
        this.time = temps;
    }

    public String getCommand() {
        return command;
    }

    public int getTime() {
        return time;

    }

    @Override 
    public String toString() {
        return command + ":" + time + "s";
        // y a t il un moyen d aller a la ligne a chaque fois quand on presente une liste ?
        
    }

}


