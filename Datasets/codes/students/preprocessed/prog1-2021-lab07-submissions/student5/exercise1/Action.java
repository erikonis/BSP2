public class Action {

    private String commandToDo;
    private int time;

    public Action(String nameOfCommand, int time) {
        this.commandToDo = nameOfCommand;
        this.time = time;
    }

    public String getCommand() {
        return commandToDo;
    }

    public int getTime() {
        return time;

    }

    @Override
    public String toString() {
        String describe = new String();
        describe = describe.concat(this.commandToDo);
        describe = describe.concat(" (" + this.time + " seconds)");
        return describe;
    }

}
