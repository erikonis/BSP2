public class LicenseException extends Exception {
    private Game game;
    private User user;

    public LicenseException(Game game, User user) {
        super("User " + user.getName() + " does not own the license for game " + game.getName());
        this.game = game;
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public User getUser() {
        return user;
    }
}