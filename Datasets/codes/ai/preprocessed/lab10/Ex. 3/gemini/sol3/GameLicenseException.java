public class GameLicenseException extends InstallationException {
    private Game game;
    private User user;

    public GameLicenseException(String message, Game game, User user) {
        super(message);
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