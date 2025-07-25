public class LicenseExceptionImpl extends Exception implements LicenseException {
    private Game game;
    private User user;

    public LicenseExceptionImpl(Game game, User user) {
        super("User " + user.getName() + " does not own the license for game " + game.getName());
        this.game = game;
        this.user = user;
    }

    @Override
    public Game getGame() {
        return game;
    }

    @Override
    public User getUser() {
        return user;
    }
}