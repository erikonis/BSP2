public class ability implements action {
    protected String name; 

    public ability(String nameOfAction) {
        this.name = nameOfAction;
    }

    public void execute(character user) {
        logger.addLogMessage("The user " + user + " executed " + name);
    }
}