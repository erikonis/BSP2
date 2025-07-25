public class LicenseNotOwnedException extends Exception {
    private final Game game;
    private final User user;

    public LicenseNotOwnedException(Game game, User user) {
        super("User does not own the license for this game.");
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