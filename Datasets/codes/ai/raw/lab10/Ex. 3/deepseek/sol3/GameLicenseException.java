public class GameLicenseException extends Exception {
    private final Game game;
    private final User user;

    public GameLicenseException(Game game, User user) {
        super("User " + user + " doesn't own license for game " + game.getName());
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