// GameLicenseException.java
public class GameLicenseException extends InstallationException {
    private final Game game;
    private final User user;

    public GameLicenseException(Game game, User user) {
        super(String.format("User %s doesn't own license for game %s", user, game.getName()));
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