public class LicenseValidationException extends InstallationException {
    private final Game game;
    private final User user;

    public LicenseValidationException(Game game, User user) {
        super("License validation failed for game: " + game.getName());
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