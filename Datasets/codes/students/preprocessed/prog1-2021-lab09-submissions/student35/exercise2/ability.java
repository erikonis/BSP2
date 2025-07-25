public class ability implements action {
    protected String name; // We are using the name variable from the inheriting classes

    public ability(String nameOfAction) {
        this.name = nameOfAction;
    }

    public void execute(character user) {
        logger.addLogMessage("The user " + user + " executed " + name);
    }
}