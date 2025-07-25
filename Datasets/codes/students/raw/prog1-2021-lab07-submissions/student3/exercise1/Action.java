package lu.uni.programming1.lab7.exercise1;

public class Action {

    private String command;
    private int time;

    public Action(String name, int time) {
        this.command = name;
        this.time = time;
    }

    public String getCommand() {
        return command;
    }

    public int getTime() {
        return time;

    }

    //@Override
    public String toString() {
        String desc = new String();
        desc = desc.concat(this.command);
        desc = desc.concat(" (" + this.time + " sec)");
        return desc;
    }

}
