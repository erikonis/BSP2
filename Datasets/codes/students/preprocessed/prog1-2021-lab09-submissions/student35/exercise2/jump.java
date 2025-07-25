public class jump implements action {

    public void execute(character user) {
        logger.addLogMessage("The user " + user + " executed a jump");
    }
}