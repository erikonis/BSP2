public class Jump extends Action {

    public Jump(Character user) {
        super(user);
    }

    @Override
    public void execute() {
        Logger.getInstance().log(new Date(), user.getName() + " performed a Jump.");
    }
}
